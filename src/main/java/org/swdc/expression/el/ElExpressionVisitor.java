package org.swdc.expression.el;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.swdc.expression.el.antlr.ElExpressionBaseVisitor;
import org.swdc.expression.el.antlr.ElExpressionParser;
import org.swdc.expression.utils.ReflectionUtil;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class ElExpressionVisitor extends ElExpressionBaseVisitor {

    private Map<String,Object> env;

    public void setEnv(Map<String, Object> env) {
        this.env = env;
    }

    public Map<String, Object> getEnv() {
        return env;
    }

    /**
     * 解析入口
     * @param ctx
     * @return
     */
    @Override
    public Object visitEvalablePart(ElExpressionParser.EvalablePartContext ctx) {
        return this.visitEvalable(ctx.evalable());
    }

    /**
     * 解析基本的数字
     * @param ctx
     * @return
     */
    @Override
    public Double visitNums(ElExpressionParser.NumsContext ctx) {
        return Double.parseDouble(ctx.getText());
    }

    /**
     * 解析基本的Boolean类型
     * @param ctx
     * @return
     */
    @Override
    public Boolean visitBool(ElExpressionParser.BoolContext ctx) {
        return Boolean.parseBoolean(ctx.getText());
    }

    /**
     * 解析变量单元（中括号里面的变量名）
     * @param ctx
     * @return
     */
    @Override
    public String visitVarUnit(ElExpressionParser.VarUnitContext ctx) {
        return visitVar(ctx.var());
    }

    /**
     * 解析变量名
     * @param ctx
     * @return
     */
    @Override
    public String visitVar(ElExpressionParser.VarContext ctx) {
        return ctx.getText();
    }

    /**
     * 解析一个变量的访问
     * @param ctx
     * @return
     */
    @Override
    public Object visitObjectVar(ElExpressionParser.ObjectVarContext ctx) {
        // 属性所在的Object
        Object target = env.get(ctx.var().getText());
        if (ctx.getChildCount() == 1) {
            return target;
        }

        for (int idx = 0; idx < ctx.getChildCount(); idx ++) {
            ParseTree tree = ctx.getChild(idx);
            if (target == null) {
                throw new RuntimeException("无法解析表达式，因为找不到对象：" + tree.getText());
            }
            if (tree instanceof ElExpressionParser.ObjectPropertyContext) {
                // 读取对象的属性
                ElExpressionParser.ObjectPropertyContext objCtx = (ElExpressionParser.ObjectPropertyContext)tree;
                String name = visitObjectProperty(objCtx);
                target = ReflectionUtil.getProperty(target,name);
            } else if (tree instanceof ElExpressionParser.ArrayIndexedContext) {
                ElExpressionParser.ArrayIndexedContext idxCtx = (ElExpressionParser.ArrayIndexedContext)tree;
                int index = visitNums(idxCtx.nums()).intValue();
                if (Collection.class.isAssignableFrom(target.getClass())) {
                    Collection coll = (Collection)target;
                    Iterator iter = coll.iterator();
                    int current = 0;
                    while (current < index) {
                        target = iter.next();
                        current ++;
                    }
                } else if (target.getClass().isArray()) {
                    target = Array.get(target,index);
                } else {
                    throw new RuntimeException("无法解析表达式，" + ctx.getText() + "无效。");
                }
            }
        }
        return target;
    }

    /**
     * 解析属性名
     * @param ctx
     * @return
     */
    @Override
    public String visitObjectProperty(ElExpressionParser.ObjectPropertyContext ctx) {
        if (ctx.DOT() != null) {
            return this.visitVar(ctx.var());
        } else {
            return this.visitVarUnit(ctx.varUnit());
        }
    }

    /**
     * 解析乘除法
     * @param ctx
     * @return
     */
    @Override
    public Object visitBasicCalcuteExpr(ElExpressionParser.BasicCalcuteExprContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitBasicWithScope(ctx.basicWithScope(0));
        }
        double number = 0;
        double result = 0;
        String op = null;
        for (int idx = 0; idx < ctx.getChildCount(); idx ++) {
            ParseTree tree = ctx.getChild(idx);
            if (tree instanceof ElExpressionParser.BasicWithScopeContext) {
                ElExpressionParser.BasicWithScopeContext withScopeContext = (ElExpressionParser.BasicWithScopeContext)tree;
                Object obj = visitBasicWithScope(withScopeContext);
                if (!Number.class.isAssignableFrom(ReflectionUtil.getBoxedClass(obj.getClass()))) {
                    throw new RuntimeException("无法完成计算，因为对象类型不是数值," + obj + "[ " + tree.getText() + "]");
                }
                number = Double.parseDouble(obj.toString());
            } else if (tree instanceof TerminalNode) {
                op = tree.getText();
            }
            if (op != null) {
                switch (op) {
                    case "*":
                    case "×":
                        result = result * number;
                        break;
                    case "/":
                    case "÷":
                        result = result / number;
                        break;
                }
            } else {
                result = number;
            }
        }
        return result;
    }

    /**
     * 解析加减法
     * @param ctx
     * @return
     */
    @Override
    public Object visitCalcutable(ElExpressionParser.CalcutableContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visitBasicCalcuteExpr(ctx.basicCalcuteExpr(0));
        }
        double number = 0;
        double result = 0;
        String op = null;
        for (int idx = 0; idx < ctx.getChildCount(); idx ++) {
            ParseTree tree = ctx.getChild(idx);
            if (tree instanceof ElExpressionParser.BasicCalcuteExprContext) {
                ElExpressionParser.BasicCalcuteExprContext context = (ElExpressionParser.BasicCalcuteExprContext)tree;
                Object obj = visitBasicCalcuteExpr(context);
                if (!Number.class.isAssignableFrom(ReflectionUtil.getBoxedClass(obj.getClass()))) {
                    throw new RuntimeException("无法完成计算，因为对象类型不是数值," + obj + "[ " + tree.getText() + "]");
                }
                number = Double.parseDouble(obj.toString());
            } else if (tree instanceof TerminalNode) {
                op = tree.getText();
            }
            if (op != null) {
                switch (op) {
                    case "+":
                        result = result + number;
                        break;
                    case "-":
                        result = result - number;
                }
            } else {
                result = number;
            }
        }
        return result;
    }

    /**
     * 解析数学运算的括号
     * @param ctx
     * @return
     */
    @Override
    public Object visitBasicWithScope(ElExpressionParser.BasicWithScopeContext ctx) {
        if (ctx.nums() != null) {
            return visitNums(ctx.nums());
        }
        if (ctx.objectVar() != null) {
            return visitObjectVar(ctx.objectVar());
        }
        return visitCalcutable(ctx.calcutable());
    }

    @Override
    public Object visitLogicCompare(ElExpressionParser.LogicCompareContext ctx) {
        Object objA = visitCalcutable(ctx.calcutable(0));
        Object objB = visitCalcutable(ctx.calcutable(1));

        boolean isNumber = ReflectionUtil.isNumber(objA) && ReflectionUtil.isNumber(objB);
        boolean isComparable = ReflectionUtil.isComparable(objA) && ReflectionUtil.isComparable(objB);

        if (ctx.EQ() != null) {
            return objA.equals(objB);
        } else if (ctx.NOTEQ() != null) {
            return !objA.equals(objB);
        }

        int rst = 0;
        if (!isNumber) {
            if (!isComparable) {
                throw new RuntimeException("对象不可以比较：" + objA.getClass() + " " + objB.getClass());
            }
            Comparable comparable = (Comparable)objA;
            rst = comparable.compareTo(objB);
        } else {
            rst = Double.compare(Double.parseDouble(objA.toString()),Double.parseDouble(objB.toString()));
        }
        if (ctx.GT() != null && rst == 1) {
            return true;
        } else if (ctx.LT() != null && rst == -1) {
            return true;
        } else if (ctx.LTEQ() != null && (rst == -1 || rst == 0) ) {
            return true;
        } else if (ctx.GTEQ() != null && (rst == 1 || rst == 0)) {
            return true;
        }
        return false;
    }

    /**
     * 解析入口点
     * @param ctx
     * @return
     */
    @Override
    public Object visitEvalable(ElExpressionParser.EvalableContext ctx) {
        if (ctx.calcutable() != null) {
            return visitCalcutable(ctx.calcutable());
        }
        return this.visitLogicalcutable(ctx.logicalcutable());
    }
}
