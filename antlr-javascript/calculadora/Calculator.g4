grammar Calculator;

file: commands+;

commands: print
         |
         assign;

assign: ID '=' expr;

print: CLG '(' expr ')';

expr: 
        expr operation=(TIMES|DIV) expr     #timesDiv
        |
        expr operation=(PLUS|MINUS) expr    #plusSubtraction
        |
        NUMBER                              #number
        |
        '(' expr ')'                        #parent
        |
        ID                                  #variable
        ;

ID:[a-zA-Z];
PLUS:   '+';
MINUS:   '-';
TIMES:'*';
DIV:   '/';
CLG:'console.log';
NUMBER:[0-9]+;
SPACES:[ \t\r\n]+ -> skip;