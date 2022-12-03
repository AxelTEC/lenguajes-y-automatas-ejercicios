import antlr4 from "antlr4";
import CalculatorLexer from "./antlrJS/CalculatorLexer.js";
import CalculatorParser from "./antlrJS/CalculatorParser.js";
import CustomVisitor from "./CustomVisitor.js";

export const compilar = (input) => {
	const chars = new antlr4.InputStream(input);
	const lexer = new CalculatorLexer(chars);
	const tokens = new antlr4.CommonTokenStream(lexer);
	const parser = new CalculatorParser(tokens);
	const tree = parser.file();
	let x = new CustomVisitor();
	tree.accept(x);
	return x.resultado;
};

compilar(`
	console.log(3-(1+1)-(10/2))
	console.log(3-1)
	console.log(4/3+a)
`);
