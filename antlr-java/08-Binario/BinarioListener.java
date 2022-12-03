// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BinarioParser}.
 */
public interface BinarioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BinarioParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(BinarioParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinarioParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(BinarioParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BinarioParser#numeroBinario}.
	 * @param ctx the parse tree
	 */
	void enterNumeroBinario(BinarioParser.NumeroBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinarioParser#numeroBinario}.
	 * @param ctx the parse tree
	 */
	void exitNumeroBinario(BinarioParser.NumeroBinarioContext ctx);
}