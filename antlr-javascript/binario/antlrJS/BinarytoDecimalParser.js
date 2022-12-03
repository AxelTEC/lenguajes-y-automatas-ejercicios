// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';
import BinarytoDecimalListener from './BinarytoDecimalListener.js';
import BinarytoDecimalVisitor from './BinarytoDecimalVisitor.js';

const serializedATN = [4,1,2,12,2,0,7,0,2,1,7,1,1,0,4,0,6,8,0,11,0,12,0,
7,1,1,1,1,1,1,0,0,2,0,2,0,0,10,0,5,1,0,0,0,2,9,1,0,0,0,4,6,3,2,1,0,5,4,1,
0,0,0,6,7,1,0,0,0,7,5,1,0,0,0,7,8,1,0,0,0,8,1,1,0,0,0,9,10,5,1,0,0,10,3,
1,0,0,0,1,7];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class BinarytoDecimalParser extends antlr4.Parser {

    static grammarFileName = "java-escape";
    static literalNames = [  ];
    static symbolicNames = [ null, "BINARY", "SPACES" ];
    static ruleNames = [ "file", "numbers" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = BinarytoDecimalParser.ruleNames;
        this.literalNames = BinarytoDecimalParser.literalNames;
        this.symbolicNames = BinarytoDecimalParser.symbolicNames;
    }

    get atn() {
        return atn;
    }



	file() {
	    let localctx = new FileContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, BinarytoDecimalParser.RULE_file);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 5; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 4;
	            this.numbers();
	            this.state = 7; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	numbers() {
	    let localctx = new NumbersContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, BinarytoDecimalParser.RULE_numbers);
	    try {
	        localctx = new BinaryContext(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 9;
	        this.match(BinarytoDecimalParser.BINARY);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

BinarytoDecimalParser.EOF = antlr4.Token.EOF;
BinarytoDecimalParser.BINARY = 1;
BinarytoDecimalParser.SPACES = 2;

BinarytoDecimalParser.RULE_file = 0;
BinarytoDecimalParser.RULE_numbers = 1;

class FileContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = BinarytoDecimalParser.RULE_file;
    }

	numbers = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NumbersContext);
	    } else {
	        return this.getTypedRuleContext(NumbersContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof BinarytoDecimalListener ) {
	        listener.enterFile(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof BinarytoDecimalListener ) {
	        listener.exitFile(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof BinarytoDecimalVisitor ) {
	        return visitor.visitFile(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class NumbersContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = BinarytoDecimalParser.RULE_numbers;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class BinaryContext extends NumbersContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	BINARY() {
	    return this.getToken(BinarytoDecimalParser.BINARY, 0);
	};

	enterRule(listener) {
	    if(listener instanceof BinarytoDecimalListener ) {
	        listener.enterBinary(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof BinarytoDecimalListener ) {
	        listener.exitBinary(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof BinarytoDecimalVisitor ) {
	        return visitor.visitBinary(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

BinarytoDecimalParser.BinaryContext = BinaryContext;


BinarytoDecimalParser.FileContext = FileContext; 
BinarytoDecimalParser.NumbersContext = NumbersContext; 
