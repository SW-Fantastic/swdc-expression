package org.swdc.expression.el;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.swdc.expression.el.antlr.ElExpressionLexer;
import org.swdc.expression.el.antlr.ElExpressionParser;

import java.util.Map;

/**
 * 基于ANTLR的El表达式实现。
 * 支持直接获取对象，基本四则运算，对象比较，布尔运算。
 */
public class ElExpression {

    private ElExpressionVisitor visitor;

    public ElExpression() {
        visitor = new ElExpressionVisitor();
    }

    public ElExpression withEnvironment(Map<String,Object> environment) {
        visitor.setEnv(environment);
        return this;
    }

    public <T> T parse(String elExpress) {
        CharStream charStream = CharStreams.fromString(elExpress);
        ElExpressionLexer lexer = new ElExpressionLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ElExpressionParser parser = new ElExpressionParser(commonTokenStream);
        return (T)visitor.visit(parser.evalablePart());
    }

}
