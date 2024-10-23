// Generated from /home/huevitoentorta/Documents/ProyectoCompi/Compilador/src/main/java/org/example/compilador/compilacion/gramatica.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
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
	 * Visit a parse tree produced by {@link gramaticaParser#calls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalls(gramaticaParser.CallsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(gramaticaParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#varial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarial(gramaticaParser.VarialContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(gramaticaParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(gramaticaParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(gramaticaParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(gramaticaParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(gramaticaParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(gramaticaParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#put}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut(gramaticaParser.PutContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(gramaticaParser.AddContext ctx);
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
	 * Visit a parse tree produced by {@link gramaticaParser#fory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFory(gramaticaParser.ForyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(gramaticaParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(gramaticaParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#elses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElses(gramaticaParser.ElsesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(gramaticaParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#whiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiles(gramaticaParser.WhilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#repeadtcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeadtcond(gramaticaParser.RepeadtcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(gramaticaParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#equations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquations(gramaticaParser.EquationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(gramaticaParser.EqualContext ctx);
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
	 * Visit a parse tree produced by {@link gramaticaParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(gramaticaParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#substr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr(gramaticaParser.SubstrContext ctx);
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
	 * Visit a parse tree produced by {@link gramaticaParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(gramaticaParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(gramaticaParser.RandomContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(gramaticaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(gramaticaParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(gramaticaParser.NumContext ctx);
}