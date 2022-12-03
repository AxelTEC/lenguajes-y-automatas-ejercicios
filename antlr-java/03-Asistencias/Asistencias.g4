grammar Asistencias;

@parser::members{
    String NEGRO (String text){ return "\u001B[30m"+text+"\u001B[0m";}
    String AZUL (String text){ return "\u001B[34m"+text+"\u001B[0m";}
    String ROJO (String text){ return "\u001B[31m"+text+"\u001B[0m";}
    String VERDE (String text){ return "\u001B[32m"+text+"\u001B[0m";}
    String AMARILLO (String text){ return "\u001B[33m"+text+"\u001B[0m";}
    String PURPURA (String text){ return "\u001B[35m"+text+"\u001B[0m";}
    String CYAN (String text){ return "\u001B[36m"+text+"\u001B[0m";}
    String BLANCO (String text){ return "\u001B[37m"+text+"\u001B[0m";}

    int contador = 0,total=0;
    String as ="";
    String nas ="";
}

lista: asistentes*  imprimir;

imprimir:{
    System.out.println(PURPURA("---------------------------------"));  
    System.out.println(PURPURA("|")+AZUL("Cantidad de Alumnos: ") + VERDE(total+"")+PURPURA("\t|"));  
    System.out.println(PURPURA("---------------------------------"));  
    System.out.println(PURPURA("|")+AZUL("Cantidad de Asistencias: ") + VERDE((total - contador)+"")+PURPURA("\t|"));  
    System.out.println(PURPURA("---------------------------------"));  
    System.out.println(as);  
    System.out.println(PURPURA("---------------------------------"));  
    System.out.println(PURPURA("|")+AZUL("Cantidad de Faltas: ") + VERDE(contador+"")+PURPURA("\t\t|"));  
    System.out.println(PURPURA("---------------------------------"));  
    System.out.println(nas);  
};

asistentes: NOMBRE ASISTENCIA
{
    if($ASISTENCIA.getText().equals("F"))
    {
        nas += ROJO(" *")+AMARILLO($NOMBRE.getText()) + "\n";
        contador++;
    }else if($ASISTENCIA.getText().equals("A")){
        as += ROJO(" *")+AMARILLO($NOMBRE.getText()) +"\n";
    }
    total++;
}
;
ASISTENCIA: 'A'|'F';
NOMBRE: [a-zA-Z]+;

ESPACIOS: [ \t\n\r]+ -> skip;

