// Generated from /home/huevitoentorta/Documents/WritingMachineCompi/Compilador/src/main/java/org/example/compilador/compilacion/gramatica.g4 by ANTLR 4.13.1
package org.example.compilador.compilacion;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(gramaticaParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(gramaticaParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#n1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN1(gramaticaParser.N1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#n2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN2(gramaticaParser.N2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#n3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3(gramaticaParser.N3Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#n4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN4(gramaticaParser.N4Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#n5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN5(gramaticaParser.N5Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#n6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN6(gramaticaParser.N6Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(gramaticaParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(gramaticaParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(gramaticaParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(gramaticaParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(gramaticaParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#greater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(gramaticaParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#smaller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmaller(gramaticaParser.SmallerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(gramaticaParser.RandomContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(gramaticaParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(gramaticaParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(gramaticaParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(gramaticaParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#put}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut(gramaticaParser.PutContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#continueup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueup(gramaticaParser.ContinueupContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#continuedown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuedown(gramaticaParser.ContinuedownContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#continueright}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueright(gramaticaParser.ContinuerightContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#continueleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueleft(gramaticaParser.ContinueleftContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#pos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPos(gramaticaParser.PosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#posx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosx(gramaticaParser.PosxContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#posy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosy(gramaticaParser.PosyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(gramaticaParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#down}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown(gramaticaParser.DownContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#up}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp(gramaticaParser.UpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#beggining}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeggining(gramaticaParser.BegginingContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(gramaticaParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#forloops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloops(gramaticaParser.ForloopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#whiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiles(gramaticaParser.WhilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(gramaticaParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cicase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicase(gramaticaParser.CicaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(gramaticaParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListpar(gramaticaParser.ListparContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listinst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListinst(gramaticaParser.ListinstContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(gramaticaParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(gramaticaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComments(gramaticaParser.CommentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#procedureSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureSection(gramaticaParser.ProcedureSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
}