import CalculatorVisitor from "./antlrJS/CalculatorVisitor.js";
import CalculatorParser from "./antlrJS/CalculatorParser.js";

export default class CustomVisitor extends CalculatorVisitor {
	// Visit a parse tree produced by CalculatorParser#file.
	// Visit a parse tree produced by CalculatorParser#file.
	visitFile(ctx) {
		return this.visitChildren(ctx);
	}

	// Visit a parse tree produced by CalculatorParser#print.
	visitPrint(ctx) {
		console.log(this.visit(ctx.expr()));
		return null;
	}

	// Visit a parse tree produced by CalculatorParser#timesDiv.
	visitTimesDiv(ctx) {
		const avalue = this.visit(ctx.expr(0));
		const bvalue = this.visit(ctx.expr(1));

		if (ctx.operation.type === CalculatorParser.TIMES) return avalue * bvalue;

		return avalue / bvalue;
	}

	// Visit a parse tree produced by CalculatorParser#number.
	visitNumber(ctx) {
		return Number(ctx.NUMBER().getText());
	}

	// Visit a parse tree produced by CalculatorParser#plusSubtraction.
	visitPlusSubtraction(ctx) {
		const avalue = this.visit(ctx.expr(0));
		const bvalue = this.visit(ctx.expr(1));

		if (ctx.operation.type === CalculatorParser.PLUS) return avalue + bvalue;

		return avalue - bvalue;

		//console.log(this.visit(ctx.expr(0)) + this.visit(ctx.expr(1)))
		//return this.visitChildren(ctx);
	}

	// Visit a parse tree produced by CalculatorParser#parenPrinc.
	visitParenPrinc(ctx) {
		return this.visit(ctx.expr());
	}

	// Visit a parse tree produced by CalculatorParser#parenPrinc.
	visitParent(ctx) {
		return this.visit(ctx.expr());
	}
}
