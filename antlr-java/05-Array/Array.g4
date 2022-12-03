grammar Array;

programa:arreglo+;
arreglo: CORCHETEIN valor? (COMA valor)* CORCHETEFI;
valor: STR
     | NUMERO
     | BOOLEAN
     | arreglo;

CORCHETEFI:']';
CORCHETEIN:'[';
COMA:',';
STR:'"'.*?'"';
NUMERO:[-+]?[0-9]+;
BOOLEAN:('true'|'false');
ESPACIOS: [ \t\r\n]+ -> skip;