// Generated from com\milenguaje\simple\interprete2\Simple.g4 by ANTLR 4.9.2
package com.milenguaje.simple.interprete2;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.milenguaje.simple.interprete2.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#temporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporal(SimpleParser.TemporalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(SimpleParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(SimpleParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(SimpleParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#put}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut(SimpleParser.PutContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(SimpleParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#continueup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueup(SimpleParser.ContinueupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#continuedown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuedown(SimpleParser.ContinuedownContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#continueright}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueright(SimpleParser.ContinuerightContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#continueleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueleft(SimpleParser.ContinueleftContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#pos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPos(SimpleParser.PosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#posx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosx(SimpleParser.PosxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#posy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosy(SimpleParser.PosyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(SimpleParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#down}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown(SimpleParser.DownContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#up}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp(SimpleParser.UpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#beggining}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeggining(SimpleParser.BegginingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#fory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFory(SimpleParser.ForyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(SimpleParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(SimpleParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#elses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElses(SimpleParser.ElsesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(SimpleParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#whiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiles(SimpleParser.WhilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(SimpleParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#equations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquations(SimpleParser.EquationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(SimpleParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(SimpleParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(SimpleParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#greater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(SimpleParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#smaller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmaller(SimpleParser.SmallerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(SimpleParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#substr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr(SimpleParser.SubstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(SimpleParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(SimpleParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(SimpleParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(SimpleParser.RandomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SimpleParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SimpleParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(SimpleParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(SimpleParser.NumContext ctx);
}