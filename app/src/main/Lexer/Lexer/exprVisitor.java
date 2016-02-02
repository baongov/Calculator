package Lexer;// Generated from expr.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link exprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface exprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link exprParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(exprParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(exprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(exprParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#binary2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary2(exprParser.Binary2Context ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(exprParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(exprParser.OpContext ctx);
}