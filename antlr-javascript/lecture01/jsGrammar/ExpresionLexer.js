// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';


const serializedATN = [4,0,4,25,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,
4,0,11,8,0,11,0,12,0,12,1,1,1,1,1,2,1,2,1,3,4,3,20,8,3,11,3,12,3,21,1,3,
1,3,0,0,4,1,1,3,2,5,3,7,4,1,0,2,1,0,48,57,3,0,9,10,13,13,32,32,26,0,1,1,
0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,1,10,1,0,0,0,3,14,1,0,0,0,5,16,
1,0,0,0,7,19,1,0,0,0,9,11,7,0,0,0,10,9,1,0,0,0,11,12,1,0,0,0,12,10,1,0,0,
0,12,13,1,0,0,0,13,2,1,0,0,0,14,15,5,43,0,0,15,4,1,0,0,0,16,17,5,42,0,0,
17,6,1,0,0,0,18,20,7,1,0,0,19,18,1,0,0,0,20,21,1,0,0,0,21,19,1,0,0,0,21,
22,1,0,0,0,22,23,1,0,0,0,23,24,6,3,0,0,24,8,1,0,0,0,3,0,12,21,1,6,0,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class ExpresionLexer extends antlr4.Lexer {

    static grammarFileName = "Expresion.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, null, "'+'", "'*'" ];
	static symbolicNames = [ null, "NUMBER", "MAS", "POR", "WS" ];
	static ruleNames = [ "NUMBER", "MAS", "POR", "WS" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    }

    get atn() {
        return atn;
    }
}

ExpresionLexer.EOF = antlr4.Token.EOF;
ExpresionLexer.NUMBER = 1;
ExpresionLexer.MAS = 2;
ExpresionLexer.POR = 3;
ExpresionLexer.WS = 4;


