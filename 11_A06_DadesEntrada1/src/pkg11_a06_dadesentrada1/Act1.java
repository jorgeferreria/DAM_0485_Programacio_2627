package pkg11_a06_dadesentrada1;

import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) {
        
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        String xarxaFavorita, frequenciaPublicacio;
        char inicialUsuari;
        int usuarisSeguits;
        double hores;
        boolean usXarxesSocials;
        
        
        // CODI
        
        System.out.print("Quina és la seva xarxa social preferida? ");
        xarxaFavorita = lector.nextLine();
        
        System.out.print("Quina és la inicial del seu usuari? ");
        inicialUsuari = lector.nextLine().charAt(0);
        
        System.out.print("A quants usuaris segueix? ");
        usuarisSeguits = lector.nextInt();
        
        System.out.print("Quantes hores fa des de l'última vegada que l'ha consultat? ");
        hores = lector.nextDouble();
        
        // BUIDAR BUFFER
        lector.nextLine();
        
        System.out.print("Quina és la seva freqüència de publicació? ");
        frequenciaPublicacio = lector.nextLine();
        
        System.out.print("Si creu que fa servir massa les xarxes socials "
                + "(ha d'escriure true / false)? ");
        usXarxesSocials = lector.nextBoolean();
        
        System.out.printf("xarxa social preferida: %s,\n"
                + "inicial del seu usuari: %c,\n"
                + "usuaris segueits: %d,\n"
                + "última vegada que l'ha consultat: %.2f,\n"
                + "freqüència de publicació: %s,\n"
                + "xarxes socials: %b\n", 
                xarxaFavorita, inicialUsuari, usuarisSeguits, hores, 
                frequenciaPublicacio, usXarxesSocials );
        
        System.out.println("--------------------------------");
        
        System.out.println("xarxa social preferida: " + xarxaFavorita
                + ",\ninicial del seu usuari: " + inicialUsuari
                + ",\nusuaris segueits: " + usuarisSeguits
                + ",\núltima vegada que l'ha consultat: " + hores
                + ",\nfreqüència de publicació: " + frequenciaPublicacio
                + ",\nxarxes socials: " + usXarxesSocials + "\n");
/*
Quina és la seva xarxa social preferida
Quina és la inicial del seu usuari
A quants usuaris segueix
Quantes hores fa des de l'última vegada que l'ha consultat 
        (introduir només 1 valor amb decimals: per exemple 1,75 vol dir 1h 45min)
Quina és la seva freqüència de publicació 
(L'usuari introduirà una frase com: una publicació cada 2h)
Si creu que fa servir massa les xarxes socials (ha d'escriure true / false)
*/
        
    }
    
}
