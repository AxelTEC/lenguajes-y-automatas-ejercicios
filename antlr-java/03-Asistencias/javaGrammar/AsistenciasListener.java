// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AsistenciasParser}.
 */
public interface AsistenciasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AsistenciasParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(AsistenciasParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistenciasParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(AsistenciasParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistenciasParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(AsistenciasParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistenciasParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(AsistenciasParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistenciasParser#asistentes}.
	 * @param ctx the parse tree
	 */
	void enterAsistentes(AsistenciasParser.AsistentesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistenciasParser#asistentes}.
	 * @param ctx the parse tree
	 */
	void exitAsistentes(AsistenciasParser.AsistentesContext ctx);
}