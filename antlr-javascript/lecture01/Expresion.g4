grammar Expresion;

file: expresion;

expresion:expresion MAS expresion 
        | expresion POR expresion 
        | NUMBER 
        ;

NUMBER:[0-9]+;
MAS:'+';
POR:'*';
WS:[\t\r\n ]+ -> skip;