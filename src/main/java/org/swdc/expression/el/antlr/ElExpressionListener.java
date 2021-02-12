package org.swdc.expression.el.antlr;
// Generated from ElExpression.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ElExpressionParser}.
 */
public interface ElExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ElExpressionParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ElExpressionParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#varUnit}.
	 * @param ctx the parse tree
	 */
	void enterVarUnit(ElExpressionParser.VarUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#varUnit}.
	 * @param ctx the parse tree
	 */
	void exitVarUnit(ElExpressionParser.VarUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#nums}.
	 * @param ctx the parse tree
	 */
	void enterNums(ElExpressionParser.NumsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#nums}.
	 * @param ctx the parse tree
	 */
	void exitNums(ElExpressionParser.NumsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ElExpressionParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ElExpressionParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#arrayIndexed}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexed(ElExpressionParser.ArrayIndexedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#arrayIndexed}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexed(ElExpressionParser.ArrayIndexedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(ElExpressionParser.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(ElExpressionParser.ObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#objectVar}.
	 * @param ctx the parse tree
	 */
	void enterObjectVar(ElExpressionParser.ObjectVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#objectVar}.
	 * @param ctx the parse tree
	 */
	void exitObjectVar(ElExpressionParser.ObjectVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#basicCalcuteExpr}.
	 * @param ctx the parse tree
	 */
	void enterBasicCalcuteExpr(ElExpressionParser.BasicCalcuteExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#basicCalcuteExpr}.
	 * @param ctx the parse tree
	 */
	void exitBasicCalcuteExpr(ElExpressionParser.BasicCalcuteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#calcutable}.
	 * @param ctx the parse tree
	 */
	void enterCalcutable(ElExpressionParser.CalcutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#calcutable}.
	 * @param ctx the parse tree
	 */
	void exitCalcutable(ElExpressionParser.CalcutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#basicWithScope}.
	 * @param ctx the parse tree
	 */
	void enterBasicWithScope(ElExpressionParser.BasicWithScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#basicWithScope}.
	 * @param ctx the parse tree
	 */
	void exitBasicWithScope(ElExpressionParser.BasicWithScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#logicCompare}.
	 * @param ctx the parse tree
	 */
	void enterLogicCompare(ElExpressionParser.LogicCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#logicCompare}.
	 * @param ctx the parse tree
	 */
	void exitLogicCompare(ElExpressionParser.LogicCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#logicalcutable}.
	 * @param ctx the parse tree
	 */
	void enterLogicalcutable(ElExpressionParser.LogicalcutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#logicalcutable}.
	 * @param ctx the parse tree
	 */
	void exitLogicalcutable(ElExpressionParser.LogicalcutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(ElExpressionParser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(ElExpressionParser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#evalable}.
	 * @param ctx the parse tree
	 */
	void enterEvalable(ElExpressionParser.EvalableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#evalable}.
	 * @param ctx the parse tree
	 */
	void exitEvalable(ElExpressionParser.EvalableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElExpressionParser#evalablePart}.
	 * @param ctx the parse tree
	 */
	void enterEvalablePart(ElExpressionParser.EvalablePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElExpressionParser#evalablePart}.
	 * @param ctx the parse tree
	 */
	void exitEvalablePart(ElExpressionParser.EvalablePartContext ctx);
}