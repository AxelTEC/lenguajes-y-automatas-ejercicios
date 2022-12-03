// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';
import ExpresionListener from './ExpresionListener.js';
import ExpresionVisitor from './ExpresionVisitor.js';

const serializedATN = [4,1,4,21,2,0,7,0,2,1,7,1,1,0,1,0,1,1,1,1,1,1,1,1,
1,1,1,1,1,1,1,1,1,1,5,1,16,8,1,10,1,12,1,19,9,1,1,1,0,1,2,2,0,2,0,0,20,0,
4,1,0,0,0,2,6,1,0,0,0,4,5,3,2,1,0,5,1,1,0,0,0,6,7,6,1,-1,0,7,8,5,1,0,0,8,
17,1,0,0,0,9,10,10,3,0,0,10,11,5,2,0,0,11,16,3,2,1,4,12,13,10,2,0,0,13,14,
5,3,0,0,14,16,3,2,1,3,15,9,1,0,0,0,15,12,1,0,0,0,16,19,1,0,0,0,17,15,1,0,
0,0,17,18,1,0,0,0,18,3,1,0,0,0,19,17,1,0,0,0,2,15,17];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class ExpresionParser extends antlr4.Parser {

    static grammarFileName = "java-escape";
    static literalNames = [ null, null, "'+'", "'*'" ];
    static symbolicNames = [ null, "NUMBER", "MAS", "POR", "WS" ];
    static ruleNames = [ "file", "expresion" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = ExpresionParser.ruleNames;
        this.literalNames = ExpresionParser.literalNames;
        this.symbolicNames = ExpresionParser.symbolicNames;
    }

    get atn() {
        return atn;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 1:
    	    		return this.expresion_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    expresion_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 3);
    		case 1:
    			return this.precpred(this._ctx, 2);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };




	file() {
	    let localctx = new FileContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, ExpresionParser.RULE_file);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 4;
	        this.expresion(0);
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


	expresion(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ExpresionContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 2;
	    this.enterRecursionRule(localctx, 2, ExpresionParser.RULE_expresion, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 7;
	        this.match(ExpresionParser.NUMBER);
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 17;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,1,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 15;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,0,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new ExpresionContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, ExpresionParser.RULE_expresion);
	                    this.state = 9;
	                    if (!( this.precpred(this._ctx, 3))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
	                    }
	                    this.state = 10;
	                    this.match(ExpresionParser.MAS);
	                    this.state = 11;
	                    this.expresion(4);
	                    break;

	                case 2:
	                    localctx = new ExpresionContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, ExpresionParser.RULE_expresion);
	                    this.state = 12;
	                    if (!( this.precpred(this._ctx, 2))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
	                    }
	                    this.state = 13;
	                    this.match(ExpresionParser.POR);
	                    this.state = 14;
	                    this.expresion(3);
	                    break;

	                } 
	            }
	            this.state = 19;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,1,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}


}

ExpresionParser.EOF = antlr4.Token.EOF;
ExpresionParser.NUMBER = 1;
ExpresionParser.MAS = 2;
ExpresionParser.POR = 3;
ExpresionParser.WS = 4;

ExpresionParser.RULE_file = 0;
ExpresionParser.RULE_expresion = 1;

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
        this.ruleIndex = ExpresionParser.RULE_file;
    }

	expresion() {
	    return this.getTypedRuleContext(ExpresionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ExpresionListener ) {
	        listener.enterFile(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ExpresionListener ) {
	        listener.exitFile(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ExpresionVisitor ) {
	        return visitor.visitFile(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExpresionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ExpresionParser.RULE_expresion;
    }

	NUMBER() {
	    return this.getToken(ExpresionParser.NUMBER, 0);
	};

	expresion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExpresionContext);
	    } else {
	        return this.getTypedRuleContext(ExpresionContext,i);
	    }
	};

	MAS() {
	    return this.getToken(ExpresionParser.MAS, 0);
	};

	POR() {
	    return this.getToken(ExpresionParser.POR, 0);
	};

	enterRule(listener) {
	    if(listener instanceof ExpresionListener ) {
	        listener.enterExpresion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ExpresionListener ) {
	        listener.exitExpresion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ExpresionVisitor ) {
	        return visitor.visitExpresion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




ExpresionParser.FileContext = FileContext; 
ExpresionParser.ExpresionContext = ExpresionContext; 
