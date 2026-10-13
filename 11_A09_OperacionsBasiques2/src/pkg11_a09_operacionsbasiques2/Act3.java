package pkg11_a09_operacionsbasiques2;

import java.util.Scanner;

public class Act3 {

    public static void main(String[] args) {
        
        /*
        Any	resultat1	resultat2	Any de traspàs?     Explicació
        2024	true            true            sí ✔                any de traspàs, divisible per 4 i no per 100
        2023	false           false           no ✘                any comú, no divisible por 4
        1900	false           false           no ✘                any comú, divisible per 100 però no per 400
        2000	true            true            sí ✔                any de traspàs, divisible per 400
        */
        
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        int any;
        boolean resultat1, resultat2, resultat3;
        
        // CODI
        
        System.out.print("Dis-me l'any a comprobar: ");
        any = lector.nextInt();
        
        resultat1 = any % 4 == 0 && (any % 100 != 0 ||  any % 400 == 0);
        resultat2 = any % 4 == 0 && any % 100 != 0 ||  any % 400 == 0;
        resultat3 = java.time.Year.isLeap(any);
        
        System.out.println(resultat1);
        System.out.println(resultat2);
        System.out.println(resultat3);
        
        
    }
    
}
