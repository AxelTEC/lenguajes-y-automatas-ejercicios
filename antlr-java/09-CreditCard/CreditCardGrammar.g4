grammar CreditCardGrammar; 
// Materia: Lenguajes y autómatas - Xenia Padilla 
// Título: Lecture03-CreditCard 
// Descipción: "Antlr para una tarjeta de credito" 
// Hecho por: Axel Enciso - 20760710 - 5SA
// Fecha: 25/10/2022 - 11:15:49.63  

@parser::members{
    // Colores para la consola
    String NEGRO (String text){ return "\u001B[30m"+text+"\u001B[0m";}
    String AZUL (String text){ return "\u001B[34m"+text+"\u001B[0m";}
    String ROJO (String text){ return "\u001B[31m"+text+"\u001B[0m";}
    String VERDE (String text){ return "\u001B[32m"+text+"\u001B[0m";}
    String AMARILLO (String text){ return "\u001B[33m"+text+"\u001B[0m";}
    String PURPURA (String text){ return "\u001B[35m"+text+"\u001B[0m";}
    String CYAN (String text){ return "\u001B[36m"+text+"\u001B[0m";}
    String BLANCO (String text){ return "\u001B[37m"+text+"\u001B[0m";}

}

//  ==================
//  = Reglas Parser  =
//  ==================
creditCard:{
    System.out.println(AZUL("-------------------------------------------------"));
    System.out.println(AZUL("| ") + VERDE("CreditCard \t => Validación: \t Tipo: ") + AZUL("\t|"));
    System.out.println(AZUL("-------------------------------------------------"));
} card+{
    System.out.println(AZUL("-------------------------------------------------"));

};

card:',' a=QUARTER b=QUARTER c=QUARTER d=QUARTER e=QUARTER? ','{
    String number = $a.getText()+$b.getText()+$c.getText()+$d.getText();
    if(number.length()>=13&&number.length()<=16){
        CreditCard cc = new CreditCard();
        boolean res = cc.checkLuhn(number);
        System.out.println(AZUL("| ") +PURPURA(""+number)+AMARILLO(" => ")+(res?VERDE("VALIDO  "):ROJO("INVALIDO"))+(res?AMARILLO(" => ")+PURPURA(cc.getType(number)):"           ")+AZUL("\t|"));
    }
    
};

//  ==================
//  = Reglas léxicas =
//  ==================
QUARTER:[0-9]+;
ESPACIOS: ~([0-9,])+ -> skip;