// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayParser}.
 */
public interface ArrayListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ArrayParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ArrayParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(ArrayParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(ArrayParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(ArrayParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(ArrayParser.ValorContext ctx);
}