// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';


const serializedATN = [4,0,11,63,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,
4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,1,0,1,0,1,1,1,1,
1,2,1,2,1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,
1,8,1,8,1,8,1,8,1,8,1,8,1,9,4,9,53,8,9,11,9,12,9,54,1,10,4,10,58,8,10,11,
10,12,10,59,1,10,1,10,0,0,11,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,
10,21,11,1,0,3,2,0,65,90,97,122,1,0,48,57,3,0,9,10,13,13,32,32,64,0,1,1,
0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,
1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,1,23,1,0,0,0,
3,25,1,0,0,0,5,27,1,0,0,0,7,29,1,0,0,0,9,31,1,0,0,0,11,33,1,0,0,0,13,35,
1,0,0,0,15,37,1,0,0,0,17,39,1,0,0,0,19,52,1,0,0,0,21,57,1,0,0,0,23,24,5,
61,0,0,24,2,1,0,0,0,25,26,5,40,0,0,26,4,1,0,0,0,27,28,5,41,0,0,28,6,1,0,
0,0,29,30,7,0,0,0,30,8,1,0,0,0,31,32,5,43,0,0,32,10,1,0,0,0,33,34,5,45,0,
0,34,12,1,0,0,0,35,36,5,42,0,0,36,14,1,0,0,0,37,38,5,47,0,0,38,16,1,0,0,
0,39,40,5,99,0,0,40,41,5,111,0,0,41,42,5,110,0,0,42,43,5,115,0,0,43,44,5,
111,0,0,44,45,5,108,0,0,45,46,5,101,0,0,46,47,5,46,0,0,47,48,5,108,0,0,48,
49,5,111,0,0,49,50,5,103,0,0,50,18,1,0,0,0,51,53,7,1,0,0,52,51,1,0,0,0,53,
54,1,0,0,0,54,52,1,0,0,0,54,55,1,0,0,0,55,20,1,0,0,0,56,58,7,2,0,0,57,56,
1,0,0,0,58,59,1,0,0,0,59,57,1,0,0,0,59,60,1,0,0,0,60,61,1,0,0,0,61,62,6,
10,0,0,62,22,1,0,0,0,3,0,54,59,1,6,0,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class CalculatorLexer extends antlr4.Lexer {

    static grammarFileName = "Calculator.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, "'='", "'('", "')'", null, "'+'", "'-'", 
                         "'*'", "'/'", "'console.log'" ];
	static symbolicNames = [ null, null, null, null, "ID", "PLUS", "MINUS", 
                          "TIMES", "DIV", "CLG", "NUMBER", "SPACES" ];
	static ruleNames = [ "T__0", "T__1", "T__2", "ID", "PLUS", "MINUS", "TIMES", 
                      "DIV", "CLG", "NUMBER", "SPACES" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    }

    get atn() {
        return atn;
    }
}

CalculatorLexer.EOF = antlr4.Token.EOF;
CalculatorLexer.T__0 = 1;
CalculatorLexer.T__1 = 2;
CalculatorLexer.T__2 = 3;
CalculatorLexer.ID = 4;
CalculatorLexer.PLUS = 5;
CalculatorLexer.MINUS = 6;
CalculatorLexer.TIMES = 7;
CalculatorLexer.DIV = 8;
CalculatorLexer.CLG = 9;
CalculatorLexer.NUMBER = 10;
CalculatorLexer.SPACES = 11;



