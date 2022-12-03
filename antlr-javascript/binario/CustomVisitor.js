import BinarytoDecimalVisitor from "./antlrJS/BinarytoDecimalVisitor.js";

export default class CustomVisitor extends BinarytoDecimalVisitor {
	// Visit a parse tree produced by BinarytoDecimalParser#file.
	visitFile(ctx) {
		return this.visitChildren(ctx);
	}

	// Visit a parse tree produced by BinarytoDecimalParser#binary.
	visitBinary(ctx) {
		let n = ctx.BINARY().getText();
		return console.log(n + " => " + parseInt(n, 2) + "\n");
	}
}
