// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IPaddressParser}.
 */
public interface IPaddressListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IPaddressParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(IPaddressParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPaddressParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(IPaddressParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPaddressParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(IPaddressParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPaddressParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(IPaddressParser.AddressContext ctx);
}