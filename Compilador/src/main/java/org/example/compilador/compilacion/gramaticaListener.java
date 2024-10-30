// Generated from /home/huevitoentorta/Documents/WritingMachineCompi/Compilador/src/main/java/org/example/compilador/compilacion/gramatica.g4 by ANTLR 4.13.1
package org.example.compilador.compilacion;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link gramaticaParser#n1}.
	 * @param ctx the parse tree
	 */
	void enterN1(gramaticaParser.N1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#n1}.
	 * @param ctx the parse tree
	 */
	void exitN1(gramaticaParser.N1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#n2}.
	 * @param ctx the parse tree
	 */
	void enterN2(gramaticaParser.N2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#n2}.
	 * @param ctx the parse tree
	 */
	void exitN2(gramaticaParser.N2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#n3}.
	 * @param ctx the parse tree
	 */
	void enterN3(gramaticaParser.N3Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#n3}.
	 * @param ctx the parse tree
	 */
	void exitN3(gramaticaParser.N3Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#n4}.
	 * @param ctx the parse tree
	 */
	void enterN4(gramaticaParser.N4Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#n4}.
	 * @param ctx the parse tree
	 */
	void exitN4(gramaticaParser.N4Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#n5}.
	 * @param ctx the parse tree
	 */
	void enterN5(gramaticaParser.N5Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#n5}.
	 * @param ctx the parse tree
	 */
	void exitN5(gramaticaParser.N5Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#n6}.
	 * @param ctx the parse tree
	 */
	void enterN6(gramaticaParser.N6Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#n6}.
	 * @param ctx the parse tree
	 */
	void exitN6(gramaticaParser.N6Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(gramaticaParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(gramaticaParser.OperacionContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(gramaticaParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(gramaticaParser.SubContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(gramaticaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(gramaticaParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#forloops}.
	 * @param ctx the parse tree
	 */
	void enterForloops(gramaticaParser.ForloopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#forloops}.
	 * @param ctx the parse tree
	 */
	void exitForloops(gramaticaParser.ForloopsContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#cicase}.
	 * @param ctx the parse tree
	 */
	void enterCicase(gramaticaParser.CicaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cicase}.
	 * @param ctx the parse tree
	 */
	void exitCicase(gramaticaParser.CicaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(gramaticaParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(gramaticaParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listpar}.
	 * @param ctx the parse tree
	 */
	void enterListpar(gramaticaParser.ListparContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listpar}.
	 * @param ctx the parse tree
	 */
	void exitListpar(gramaticaParser.ListparContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listinst}.
	 * @param ctx the parse tree
	 */
	void enterListinst(gramaticaParser.ListinstContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listinst}.
	 * @param ctx the parse tree
	 */
	void exitListinst(gramaticaParser.ListinstContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(gramaticaParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(gramaticaParser.ProcedureContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#procedureSection}.
	 * @param ctx the parse tree
	 */
	void enterProcedureSection(gramaticaParser.ProcedureSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#procedureSection}.
	 * @param ctx the parse tree
	 */
	void exitProcedureSection(gramaticaParser.ProcedureSectionContext ctx);
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
}