import antlr4 from "antlr4";
import BinarytoDecimalLexer from "./antlrJS/BinarytoDecimalLexer.js";
import BinarytoDecimalParser from "./antlrJS/BinarytoDecimalParser.js";
import CustomVisitor from "./CustomVisitor.js";

export const compilar = (input) => {
	const chars = new antlr4.InputStream(input);
	const lexer = new BinarytoDecimalLexer(chars);
	const tokens = new antlr4.CommonTokenStream(lexer);
	const parser = new BinarytoDecimalParser(tokens);
	const tree = parser.file();
	let x = new CustomVisitor();
	tree.accept(x);
	return x.resultado;
};

compilar(`
	10100
	01010
	1110 
`);
