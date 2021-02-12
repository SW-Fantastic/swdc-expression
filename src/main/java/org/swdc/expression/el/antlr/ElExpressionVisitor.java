package org.swdc.expression.el.antlr;
// Generated from ElExpression.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ElExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ElExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ElExpressionParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#varUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarUnit(ElExpressionParser.VarUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNums(ElExpressionParser.NumsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ElExpressionParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#arrayIndexed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexed(ElExpressionParser.ArrayIndexedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(ElExpressionParser.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#objectVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectVar(ElExpressionParser.ObjectVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#basicCalcuteExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicCalcuteExpr(ElExpressionParser.BasicCalcuteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#calcutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcutable(ElExpressionParser.CalcutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#basicWithScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicWithScope(ElExpressionParser.BasicWithScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#logicCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicCompare(ElExpressionParser.LogicCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#logicalcutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalcutable(ElExpressionParser.LogicalcutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr(ElExpressionParser.LogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#evalable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalable(ElExpressionParser.EvalableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElExpressionParser#evalablePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalablePart(ElExpressionParser.EvalablePartContext ctx);
}