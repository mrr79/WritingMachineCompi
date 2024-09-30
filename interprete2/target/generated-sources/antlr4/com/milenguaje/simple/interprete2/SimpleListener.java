// Generated from com\milenguaje\simple\interprete2\Simple.g4 by ANTLR 4.9.2
package com.milenguaje.simple.interprete2;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.milenguaje.simple.interprete2.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#temporal}.
	 * @param ctx the parse tree
	 */
	void enterTemporal(SimpleParser.TemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#temporal}.
	 * @param ctx the parse tree
	 */
	void exitTemporal(SimpleParser.TemporalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(SimpleParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(SimpleParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(SimpleParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(SimpleParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(SimpleParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(SimpleParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#put}.
	 * @param ctx the parse tree
	 */
	void enterPut(SimpleParser.PutContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#put}.
	 * @param ctx the parse tree
	 */
	void exitPut(SimpleParser.PutContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(SimpleParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(SimpleParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#continueup}.
	 * @param ctx the parse tree
	 */
	void enterContinueup(SimpleParser.ContinueupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#continueup}.
	 * @param ctx the parse tree
	 */
	void exitContinueup(SimpleParser.ContinueupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#continuedown}.
	 * @param ctx the parse tree
	 */
	void enterContinuedown(SimpleParser.ContinuedownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#continuedown}.
	 * @param ctx the parse tree
	 */
	void exitContinuedown(SimpleParser.ContinuedownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#continueright}.
	 * @param ctx the parse tree
	 */
	void enterContinueright(SimpleParser.ContinuerightContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#continueright}.
	 * @param ctx the parse tree
	 */
	void exitContinueright(SimpleParser.ContinuerightContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#continueleft}.
	 * @param ctx the parse tree
	 */
	void enterContinueleft(SimpleParser.ContinueleftContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#continueleft}.
	 * @param ctx the parse tree
	 */
	void exitContinueleft(SimpleParser.ContinueleftContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#pos}.
	 * @param ctx the parse tree
	 */
	void enterPos(SimpleParser.PosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#pos}.
	 * @param ctx the parse tree
	 */
	void exitPos(SimpleParser.PosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#posx}.
	 * @param ctx the parse tree
	 */
	void enterPosx(SimpleParser.PosxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#posx}.
	 * @param ctx the parse tree
	 */
	void exitPosx(SimpleParser.PosxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#posy}.
	 * @param ctx the parse tree
	 */
	void enterPosy(SimpleParser.PosyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#posy}.
	 * @param ctx the parse tree
	 */
	void exitPosy(SimpleParser.PosyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(SimpleParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(SimpleParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#down}.
	 * @param ctx the parse tree
	 */
	void enterDown(SimpleParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#down}.
	 * @param ctx the parse tree
	 */
	void exitDown(SimpleParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#up}.
	 * @param ctx the parse tree
	 */
	void enterUp(SimpleParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#up}.
	 * @param ctx the parse tree
	 */
	void exitUp(SimpleParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#beggining}.
	 * @param ctx the parse tree
	 */
	void enterBeggining(SimpleParser.BegginingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#beggining}.
	 * @param ctx the parse tree
	 */
	void exitBeggining(SimpleParser.BegginingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#fory}.
	 * @param ctx the parse tree
	 */
	void enterFory(SimpleParser.ForyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#fory}.
	 * @param ctx the parse tree
	 */
	void exitFory(SimpleParser.ForyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(SimpleParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(SimpleParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(SimpleParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(SimpleParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#elses}.
	 * @param ctx the parse tree
	 */
	void enterElses(SimpleParser.ElsesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#elses}.
	 * @param ctx the parse tree
	 */
	void exitElses(SimpleParser.ElsesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(SimpleParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(SimpleParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#whiles}.
	 * @param ctx the parse tree
	 */
	void enterWhiles(SimpleParser.WhilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#whiles}.
	 * @param ctx the parse tree
	 */
	void exitWhiles(SimpleParser.WhilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(SimpleParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(SimpleParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#equations}.
	 * @param ctx the parse tree
	 */
	void enterEquations(SimpleParser.EquationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#equations}.
	 * @param ctx the parse tree
	 */
	void exitEquations(SimpleParser.EquationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(SimpleParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(SimpleParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(SimpleParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(SimpleParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(SimpleParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(SimpleParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(SimpleParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(SimpleParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#smaller}.
	 * @param ctx the parse tree
	 */
	void enterSmaller(SimpleParser.SmallerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#smaller}.
	 * @param ctx the parse tree
	 */
	void exitSmaller(SimpleParser.SmallerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(SimpleParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(SimpleParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#substr}.
	 * @param ctx the parse tree
	 */
	void enterSubstr(SimpleParser.SubstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#substr}.
	 * @param ctx the parse tree
	 */
	void exitSubstr(SimpleParser.SubstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(SimpleParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(SimpleParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(SimpleParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(SimpleParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(SimpleParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(SimpleParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(SimpleParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(SimpleParser.RandomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SimpleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(SimpleParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(SimpleParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(SimpleParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(SimpleParser.NumContext ctx);
}