// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CreditCardGrammarParser}.
 */
public interface CreditCardGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CreditCardGrammarParser#creditCard}.
	 * @param ctx the parse tree
	 */
	void enterCreditCard(CreditCardGrammarParser.CreditCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreditCardGrammarParser#creditCard}.
	 * @param ctx the parse tree
	 */
	void exitCreditCard(CreditCardGrammarParser.CreditCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreditCardGrammarParser#card}.
	 * @param ctx the parse tree
	 */
	void enterCard(CreditCardGrammarParser.CardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreditCardGrammarParser#card}.
	 * @param ctx the parse tree
	 */
	void exitCard(CreditCardGrammarParser.CardContext ctx);
}