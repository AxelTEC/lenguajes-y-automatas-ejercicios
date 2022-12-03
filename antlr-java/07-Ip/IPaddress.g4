grammar IPaddress;

// Author : ME Xenia P Date : Oct 18 2022

// Create a IP grammar Instructions: The grammar will be able to list IP address from a file
// Communications server: diagnosis guide (testFile.dat) IBM log file example:
// https://www.ibm.com/docs/en/zos/2.1.0?topic=problems-example-log-file

@parser::members{
    String NEGRO (String text){ return "\u001B[30m"+text+"\u001B[0m";}
    String AZUL (String text){ return "\u001B[34m"+text+"\u001B[0m";}
    String ROJO (String text){ return "\u001B[31m"+text+"\u001B[0m";}
    String VERDE (String text){ return "\u001B[32m"+text+"\u001B[0m";}
    String AMARILLO (String text){ return "\u001B[33m"+text+"\u001B[0m";}
    String PURPURA (String text){ return "\u001B[35m"+text+"\u001B[0m";}
    String CYAN (String text){ return "\u001B[36m"+text+"\u001B[0m";}
    String BLANCO (String text){ return "\u001B[37m"+text+"\u001B[0m";}

    void printdots(){ System.out.println(AMARILLO("---------------------------------"));}
    int contador = 0;
}

programa:{
    printdots();
    System.out.println(AMARILLO("|\t")+ROJO("IP's Encontradas:")+AMARILLO("\t|"));
    printdots();  
} address+ {
    printdots();  
    System.out.println(AMARILLO("|\t")+VERDE("Total: "+contador)+AMARILLO("\t\t|"));
    printdots();  
};

address:
    ~IP* IP ~IP*{
    System.out.println(AMARILLO("|\t")+PURPURA($IP.getText())+AMARILLO("\t\t|"));
    contador++;
}; 

IP: INT '.' INT '.' INT '.' INT; //Match IP
INT: [0-9]+; //Match integer
NO: ~([0-9])+ -> skip; //Skip everything is NAN