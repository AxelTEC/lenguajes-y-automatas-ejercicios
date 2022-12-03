grammar BinarytoDecimal;

file : numbers+;

numbers: BINARY      #binary
;

BINARY: [01]+;
SPACES  :   [ \t\r\n]+ -> skip;