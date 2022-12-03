grammar LenguajeC;

programa: VOID MAIN PAREN_A  PAREN_C LLAVE_A LLAVE_C;

/* Lexico */
VOID: 'void';
MAIN: 'main';
PAREN_A:'(';
PAREN_C:')';
LLAVE_A:'{';
LLAVE_C:'}';
ESPACIOS: [ \t\r\n] -> skip ;