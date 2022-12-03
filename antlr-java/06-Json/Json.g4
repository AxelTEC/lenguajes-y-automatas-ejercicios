grammar Json;

programa:json;
json: objeto ;
objeto:LLAVEIN atributo* LLAVEFI;
atributo: STR PUNTOS valor COMA?;
arreglo: CORCHETEIN valor? (COMA valor)* CORCHETEFI;
valor: STR
     | NUMERO
     | objeto
     | arreglo;

LLAVEIN:'{';
LLAVEFI:'}';
NUMERO:[0-9]+;
COMILLA:'"';
COMA:',';
PUNTOS:':';
CORCHETEFI:']';
CORCHETEIN:'[';
STR:'"'.*?'"';
ESPACIOS: [ \t\r\n]+ -> skip;
/* WS:''*; */
