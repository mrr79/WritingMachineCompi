// Generated from /home/huevitoentorta/Documents/ProyectoCompi/Compilador/src/main/java/org/example/compilador/compilacion/gramatica.g4 by ANTLR 4.13.1
package org.example.compilador.compilacion;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(gramaticaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(gramaticaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(gramaticaParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(gramaticaParser.CommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#calls}.
	 * @param ctx the parse tree
	 */
	void enterCalls(gramaticaParser.CallsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#calls}.
	 * @param ctx the parse tree
	 */
	void exitCalls(gramaticaParser.CallsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(gramaticaParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(gramaticaParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varial}.
	 * @param ctx the parse tree
	 */
	void enterVarial(gramaticaParser.VarialContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varial}.
	 * @param ctx the parse tree
	 */
	void exitVarial(gramaticaParser.VarialContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(gramaticaParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(gramaticaParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(gramaticaParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(gramaticaParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(gramaticaParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(gramaticaParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(gramaticaParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(gramaticaParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(gramaticaParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(gramaticaParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(gramaticaParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(gramaticaParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#put}.
	 * @param ctx the parse tree
	 */
	void enterPut(gramaticaParser.PutContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#put}.
	 * @param ctx the parse tree
	 */
	void exitPut(gramaticaParser.PutContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(gramaticaParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(gramaticaParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#continueup}.
	 * @param ctx the parse tree
	 */
	void enterContinueup(gramaticaParser.ContinueupContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#continueup}.
	 * @param ctx the parse tree
	 */
	void exitContinueup(gramaticaParser.ContinueupContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#continuedown}.
	 * @param ctx the parse tree
	 */
	void enterContinuedown(gramaticaParser.ContinuedownContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#continuedown}.
	 * @param ctx the parse tree
	 */
	void exitContinuedown(gramaticaParser.ContinuedownContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#continueright}.
	 * @param ctx the parse tree
	 */
	void enterContinueright(gramaticaParser.ContinuerightContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#continueright}.
	 * @param ctx the parse tree
	 */
	void exitContinueright(gramaticaParser.ContinuerightContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#continueleft}.
	 * @param ctx the parse tree
	 */
	void enterContinueleft(gramaticaParser.ContinueleftContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#continueleft}.
	 * @param ctx the parse tree
	 */
	void exitContinueleft(gramaticaParser.ContinueleftContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#pos}.
	 * @param ctx the parse tree
	 */
	void enterPos(gramaticaParser.PosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#pos}.
	 * @param ctx the parse tree
	 */
	void exitPos(gramaticaParser.PosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#posx}.
	 * @param ctx the parse tree
	 */
	void enterPosx(gramaticaParser.PosxContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#posx}.
	 * @param ctx the parse tree
	 */
	void exitPosx(gramaticaParser.PosxContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#posy}.
	 * @param ctx the parse tree
	 */
	void enterPosy(gramaticaParser.PosyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#posy}.
	 * @param ctx the parse tree
	 */
	void exitPosy(gramaticaParser.PosyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(gramaticaParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(gramaticaParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#down}.
	 * @param ctx the parse tree
	 */
	void enterDown(gramaticaParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#down}.
	 * @param ctx the parse tree
	 */
	void exitDown(gramaticaParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#up}.
	 * @param ctx the parse tree
	 */
	void enterUp(gramaticaParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#up}.
	 * @param ctx the parse tree
	 */
	void exitUp(gramaticaParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#beggining}.
	 * @param ctx the parse tree
	 */
	void enterBeggining(gramaticaParser.BegginingContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#beggining}.
	 * @param ctx the parse tree
	 */
	void exitBeggining(gramaticaParser.BegginingContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fory}.
	 * @param ctx the parse tree
	 */
	void enterFory(gramaticaParser.ForyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fory}.
	 * @param ctx the parse tree
	 */
	void exitFory(gramaticaParser.ForyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(gramaticaParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(gramaticaParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(gramaticaParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(gramaticaParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#elses}.
	 * @param ctx the parse tree
	 */
	void enterElses(gramaticaParser.ElsesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#elses}.
	 * @param ctx the parse tree
	 */
	void exitElses(gramaticaParser.ElsesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(gramaticaParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(gramaticaParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#whiles}.
	 * @param ctx the parse tree
	 */
	void enterWhiles(gramaticaParser.WhilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#whiles}.
	 * @param ctx the parse tree
	 */
	void exitWhiles(gramaticaParser.WhilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#repeadtcond}.
	 * @param ctx the parse tree
	 */
	void enterRepeadtcond(gramaticaParser.RepeadtcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#repeadtcond}.
	 * @param ctx the parse tree
	 */
	void exitRepeadtcond(gramaticaParser.RepeadtcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(gramaticaParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(gramaticaParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#equations}.
	 * @param ctx the parse tree
	 */
	void enterEquations(gramaticaParser.EquationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#equations}.
	 * @param ctx the parse tree
	 */
	void exitEquations(gramaticaParser.EquationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(gramaticaParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(gramaticaParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(gramaticaParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(gramaticaParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(gramaticaParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(gramaticaParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(gramaticaParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(gramaticaParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#smaller}.
	 * @param ctx the parse tree
	 */
	void enterSmaller(gramaticaParser.SmallerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#smaller}.
	 * @param ctx the parse tree
	 */
	void exitSmaller(gramaticaParser.SmallerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(gramaticaParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(gramaticaParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#substr}.
	 * @param ctx the parse tree
	 */
	void enterSubstr(gramaticaParser.SubstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#substr}.
	 * @param ctx the parse tree
	 */
	void exitSubstr(gramaticaParser.SubstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(gramaticaParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(gramaticaParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(gramaticaParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(gramaticaParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(gramaticaParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(gramaticaParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(gramaticaParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(gramaticaParser.RandomContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(gramaticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(gramaticaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(gramaticaParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(gramaticaParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(gramaticaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(gramaticaParser.NumContext ctx);
}