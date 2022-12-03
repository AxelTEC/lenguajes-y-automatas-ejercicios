// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Xml_claseParser}.
 */
public interface Xml_claseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Xml_claseParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Xml_claseParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Xml_claseParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Xml_claseParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Xml_claseParser#xml}.
	 * @param ctx the parse tree
	 */
	void enterXml(Xml_claseParser.XmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Xml_claseParser#xml}.
	 * @param ctx the parse tree
	 */
	void exitXml(Xml_claseParser.XmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Xml_claseParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(Xml_claseParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Xml_claseParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(Xml_claseParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Xml_claseParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void enterOpen_tag(Xml_claseParser.Open_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Xml_claseParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void exitOpen_tag(Xml_claseParser.Open_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Xml_claseParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(Xml_claseParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Xml_claseParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(Xml_claseParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Xml_claseParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void enterClose_tag(Xml_claseParser.Close_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Xml_claseParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void exitClose_tag(Xml_claseParser.Close_tagContext ctx);
}