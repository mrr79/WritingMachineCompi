// Generated from Simple.g4 by ANTLR 4.4
package com.milenguaje.simple.interprete2;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.milenguaje.simple.interprete2.ast.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#smaller}.
	 * @param ctx the parse tree
	 */
	void enterSmaller(@NotNull SimpleParser.SmallerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#smaller}.
	 * @param ctx the parse tree
	 */
	void exitSmaller(@NotNull SimpleParser.SmallerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull SimpleParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull SimpleParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(@NotNull SimpleParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(@NotNull SimpleParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(@NotNull SimpleParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(@NotNull SimpleParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull SimpleParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull SimpleParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(@NotNull SimpleParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(@NotNull SimpleParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(@NotNull SimpleParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(@NotNull SimpleParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#down}.
	 * @param ctx the parse tree
	 */
	void enterDown(@NotNull SimpleParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#down}.
	 * @param ctx the parse tree
	 */
	void exitDown(@NotNull SimpleParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(@NotNull SimpleParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(@NotNull SimpleParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#put}.
	 * @param ctx the parse tree
	 */
	void enterPut(@NotNull SimpleParser.PutContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#put}.
	 * @param ctx the parse tree
	 */
	void exitPut(@NotNull SimpleParser.PutContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#continueright}.
	 * @param ctx the parse tree
	 */
	void enterContinueright(@NotNull SimpleParser.ContinuerightContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#continueright}.
	 * @param ctx the parse tree
	 */
	void exitContinueright(@NotNull SimpleParser.ContinuerightContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#posx}.
	 * @param ctx the parse tree
	 */
	void enterPosx(@NotNull SimpleParser.PosxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#posx}.
	 * @param ctx the parse tree
	 */
	void exitPosx(@NotNull SimpleParser.PosxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#equations}.
	 * @param ctx the parse tree
	 */
	void enterEquations(@NotNull SimpleParser.EquationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#equations}.
	 * @param ctx the parse tree
	 */
	void exitEquations(@NotNull SimpleParser.EquationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull SimpleParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull SimpleParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#posy}.
	 * @param ctx the parse tree
	 */
	void enterPosy(@NotNull SimpleParser.PosyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#posy}.
	 * @param ctx the parse tree
	 */
	void exitPosy(@NotNull SimpleParser.PosyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(@NotNull SimpleParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(@NotNull SimpleParser.RandomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#continuedown}.
	 * @param ctx the parse tree
	 */
	void enterContinuedown(@NotNull SimpleParser.ContinuedownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#continuedown}.
	 * @param ctx the parse tree
	 */
	void exitContinuedown(@NotNull SimpleParser.ContinuedownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#pos}.
	 * @param ctx the parse tree
	 */
	void enterPos(@NotNull SimpleParser.PosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#pos}.
	 * @param ctx the parse tree
	 */
	void exitPos(@NotNull SimpleParser.PosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull SimpleParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull SimpleParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(@NotNull SimpleParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(@NotNull SimpleParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(@NotNull SimpleParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(@NotNull SimpleParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#elses}.
	 * @param ctx the parse tree
	 */
	void enterElses(@NotNull SimpleParser.ElsesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#elses}.
	 * @param ctx the parse tree
	 */
	void exitElses(@NotNull SimpleParser.ElsesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#whiles}.
	 * @param ctx the parse tree
	 */
	void enterWhiles(@NotNull SimpleParser.WhilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#whiles}.
	 * @param ctx the parse tree
	 */
	void exitWhiles(@NotNull SimpleParser.WhilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#continueup}.
	 * @param ctx the parse tree
	 */
	void enterContinueup(@NotNull SimpleParser.ContinueupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#continueup}.
	 * @param ctx the parse tree
	 */
	void exitContinueup(@NotNull SimpleParser.ContinueupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull SimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull SimpleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#up}.
	 * @param ctx the parse tree
	 */
	void enterUp(@NotNull SimpleParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#up}.
	 * @param ctx the parse tree
	 */
	void exitUp(@NotNull SimpleParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull SimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull SimpleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(@NotNull SimpleParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(@NotNull SimpleParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull SimpleParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull SimpleParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull SimpleParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull SimpleParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#fory}.
	 * @param ctx the parse tree
	 */
	void enterFory(@NotNull SimpleParser.ForyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#fory}.
	 * @param ctx the parse tree
	 */
	void exitFory(@NotNull SimpleParser.ForyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#repeadtcond}.
	 * @param ctx the parse tree
	 */
	void enterRepeadtcond(@NotNull SimpleParser.RepeadtcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#repeadtcond}.
	 * @param ctx the parse tree
	 */
	void exitRepeadtcond(@NotNull SimpleParser.RepeadtcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(@NotNull SimpleParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(@NotNull SimpleParser.CommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(@NotNull SimpleParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(@NotNull SimpleParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull SimpleParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull SimpleParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SimpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#substr}.
	 * @param ctx the parse tree
	 */
	void enterSubstr(@NotNull SimpleParser.SubstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#substr}.
	 * @param ctx the parse tree
	 */
	void exitSubstr(@NotNull SimpleParser.SubstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(@NotNull SimpleParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(@NotNull SimpleParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(@NotNull SimpleParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(@NotNull SimpleParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#continueleft}.
	 * @param ctx the parse tree
	 */
	void enterContinueleft(@NotNull SimpleParser.ContinueleftContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#continueleft}.
	 * @param ctx the parse tree
	 */
	void exitContinueleft(@NotNull SimpleParser.ContinueleftContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#beggining}.
	 * @param ctx the parse tree
	 */
	void enterBeggining(@NotNull SimpleParser.BegginingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#beggining}.
	 * @param ctx the parse tree
	 */
	void exitBeggining(@NotNull SimpleParser.BegginingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(@NotNull SimpleParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(@NotNull SimpleParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull SimpleParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull SimpleParser.OperationContext ctx);
}