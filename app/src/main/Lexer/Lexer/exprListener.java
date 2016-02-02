package Lexer;// Generated from expr.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;
/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exprParser}.
 */
public interface exprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exprParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(exprParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(exprParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(exprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(exprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(exprParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(exprParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#binary2}.
	 * @param ctx the parse tree
	 */
	void enterBinary2(exprParser.Binary2Context ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#binary2}.
	 * @param ctx the parse tree
	 */
	void exitBinary2(exprParser.Binary2Context ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(exprParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(exprParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(exprParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(exprParser.OpContext ctx);
}