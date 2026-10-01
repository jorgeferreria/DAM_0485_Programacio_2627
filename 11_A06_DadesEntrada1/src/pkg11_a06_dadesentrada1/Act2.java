package pkg11_a06_dadesentrada1;

import java.util.Scanner;

public class Act2 {

    public static void main(String[] args) {

        // VARIABLES
        Scanner lector = new Scanner(System.in);
        double consum100, kilometresPerLitre, totalLitres;
        int kms;
        final int NUMERO_CIEN = 100; // CONSTANT

        // CODI
        System.out.print("lites x 100KM? ");
        consum100 = lector.nextDouble();

        System.out.print("Kilometres a recorrer? ");
        kms = lector.nextInt();

        kilometresPerLitre = NUMERO_CIEN / consum100;

        totalLitres = kms * consum100 / NUMERO_CIEN;

        System.out.printf("Has de recórrer %d km i el teu motor consumeix %.1f litres "
                + "per cada %dkm (%.1f km/l): \n"
                + "en total consumiràs %.1f litres\n",
                kms, consum100, NUMERO_CIEN, kilometresPerLitre, totalLitres);

        /*
Demani a l'usuari els litres per 100 km (amb un decimal) que consumeix el motor 
        del seu cotxe, i la distància en km (sense decimals) que hi ha fins al seu destí. 
        Desa els valors en les variables del tipus adequat.
Mostri per pantalla amb printf() i en un únic paràgraf, la informació de quants 
        km ha de recórrer, el consum del motor per 100 km, els km que pot recórrer 
        amb 1 litre, i el consum total del viatge, en litres amb 1 decimal.
Exemple de sortida:
Has de recórrer 25km i el teu motor consumeix 6,8 litres per cada 100km (14,7 km/l): 
        en total consumiràs 1,7 litres

         */
    }

}
