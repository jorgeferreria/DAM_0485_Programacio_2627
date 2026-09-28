package pkg11_a04_formatsortida1;

public class Act1 {

    public static void main(String[] args) {
        // VARIABLES
        char inicial = 'r';
        int edat = 79;
        double alsada = 1.70;
        String nomCiutat = "Montcada i Reixac";
        boolean agradarFutbol = false;
        
        // CODI
        // PRINTLN
        System.out.println("Inicial: " + inicial);
        System.out.println("Edat: " + edat);
        System.out.println("Alçada: " + alsada);
        System.out.println("Ciutat: " + nomCiutat);
        System.out.println("T'agrada el futbol? " + agradarFutbol);
        
        System.out.println("####################################");
        
        // PRINTF o FORMAT
        System.out.printf("Inicial: %C\n", inicial);
        System.out.printf("Edat: %d\n", edat);
        System.out.printf("Alçada: %.2f\n", alsada);
        System.out.printf("Ciutat: %S\n", nomCiutat);
        System.out.printf("T'agrada el futbol? %B\n", agradarFutbol);
        
        
/*
Guarda en variables la lletra inicial (en majúscula) del teu primer cognom, 
        la teva edat, la teva alçada en metres, el nom de la teva ciutat 
        i si t'agrada o no el futbol.

A continuació mostra per pantalla amb println() els valors anteriors, 
        concatenant-los amb missatges adequats:
"La meva inicial és la H
"La meva edat és...

Finalment, mostra amb printf() la mateixa informació que abans, 
        imprimint una línia diferent per cada concepte

*/


        
    }
    
}
