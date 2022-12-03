// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(JsonParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(JsonParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(JsonParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(JsonParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(JsonParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(JsonParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(JsonParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(JsonParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(JsonParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(JsonParser.ValorContext ctx);
}