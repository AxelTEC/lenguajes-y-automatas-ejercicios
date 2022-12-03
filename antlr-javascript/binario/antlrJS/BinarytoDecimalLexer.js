// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';


const serializedATN = [4,0,2,17,6,-1,2,0,7,0,2,1,7,1,1,0,4,0,7,8,0,11,0,
12,0,8,1,1,4,1,12,8,1,11,1,12,1,13,1,1,1,1,0,0,2,1,1,3,2,1,0,2,1,0,48,49,
3,0,9,10,13,13,32,32,18,0,1,1,0,0,0,0,3,1,0,0,0,1,6,1,0,0,0,3,11,1,0,0,0,
5,7,7,0,0,0,6,5,1,0,0,0,7,8,1,0,0,0,8,6,1,0,0,0,8,9,1,0,0,0,9,2,1,0,0,0,
10,12,7,1,0,0,11,10,1,0,0,0,12,13,1,0,0,0,13,11,1,0,0,0,13,14,1,0,0,0,14,
15,1,0,0,0,15,16,6,1,0,0,16,4,1,0,0,0,3,0,8,13,1,6,0,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class BinarytoDecimalLexer extends antlr4.Lexer {

    static grammarFileName = "BinarytoDecimal.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [  ];
	static symbolicNames = [ null, "BINARY", "SPACES" ];
	static ruleNames = [ "BINARY", "SPACES" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    }

    get atn() {
        return atn;
    }
}

BinarytoDecimalLexer.EOF = antlr4.Token.EOF;
BinarytoDecimalLexer.BINARY = 1;
BinarytoDecimalLexer.SPACES = 2;



