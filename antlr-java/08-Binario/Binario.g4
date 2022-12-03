grammar Binario;
@parser::members{
    String NEGRO (String text){ return "\u001B[30m"+text+"\u001B[0m";}
    String AZUL (String text){ return "\u001B[34m"+text+"\u001B[0m";}
    String ROJO (String text){ return "\u001B[31m"+text+"\u001B[0m";}
    String VERDE (String text){ return "\u001B[32m"+text+"\u001B[0m";}
    String AMARILLO (String text){ return "\u001B[33m"+text+"\u001B[0m";}
    String PURPURA (String text){ return "\u001B[35m"+text+"\u001B[0m";}
    String CYAN (String text){ return "\u001B[36m"+text+"\u001B[0m";}
    String BLANCO (String text){ return "\u001B[37m"+text+"\u001B[0m";}

}

programa:{
    System.out.println(AZUL("---------------------------------"));
    System.out.println(AZUL("|\t") + VERDE("Binario  => Decimal     ") + AZUL("|"));
    System.out.println(AZUL("---------------------------------"));
}
numeroBinario* ;



numeroBinario: BINARIO{
    Convertidor c = new Convertidor();
    System.out.println(AZUL("|\t") + ROJO($BINARIO.getText())+ AMARILLO(" => ") + ROJO(c.binaryToDecimal($BINARIO.getText())+"")+ AZUL("\t\t|"));
    System.out.println(AZUL("---------------------------------"));
};

BINARIO:[01]+;
WS: [ \t\r\n]+ -> skip;
COMENTARIO: '/*' .*? '*/' -> skip;