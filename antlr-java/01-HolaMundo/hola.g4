grammar hola;

prog : 'Hola' ID ;
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip;