package pkg11_a18_consolidaciopintura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int llarg, ample, alt;
        String nom;

        int litresGastar, litresSobren, metresGastar, metresSobren,
                perimetreTerra, areaParets;
        final int LITRES_BIDO = 50;
        final int METRES_ROTLLE = 30;

        double percentatgeLitresUsats, percentatgeMetresSobrant;

        //Demanar dades
        System.out.print("Introdueix el llarg en metres sense decimals: ");
        llarg = lector.nextInt();

        System.out.print("Introdueix l'ample en metres sense decimals: ");
        ample = lector.nextInt();

        System.out.print("Introdueix l'alçada en metres sense decimals: ");
        alt = lector.nextInt();

        lector.nextLine(); // BUIDAR BUFFER
        
        System.out.print("Introdueix el nom de l'espai: ");
        nom = lector.nextLine();

        //càlculs per trobar l'àrea a pintar
        /*
        area = base * altura
         */
        areaParets = 2 * (llarg * alt + ample * alt); // 4 parets

        /*
        Calcular els materials que es gastaran i els que sobraran
         */
        //cada litre serveix per pintar 1 m2, però calen 3 capes
        litresGastar = 3 * areaParets;
        //El mòdul ens dóna els litres gastats de l'últim bidó.
        //Restat de la capacitat del bidó, ens dóna els que sobren
        litresSobren = LITRES_BIDO - (litresGastar % LITRES_BIDO);

        //Cal cobrir amb cinta el perímetre del terra i del sostre (són iguals)
        perimetreTerra = 2 * (llarg + ample);

        metresGastar = 2 * perimetreTerra; // terra i sostre
        //El mateix que amb la pintura
        metresSobren = METRES_ROTLLE - (metresGastar % METRES_ROTLLE);

        //Percentatges de material sobrant i aprofitat
        percentatgeMetresSobrant
                = (double) metresSobren / (metresGastar + metresSobren) * 100;

        percentatgeLitresUsats
                = (double) litresGastar / (litresGastar + litresSobren) * 100;

        //mostrar resultats
        System.out.printf("\n\nMaterials per a \"%S\"\n\n", nom);
        System.out.printf("Per pintar %d metres quadrats de paret, "
                + "gastaràs %d litres de pintura i en sobraran %d. \n",
                areaParets, litresGastar, litresSobren);

        System.out.printf("%S té un perímetre de %d metres. Gastaràs %d metres"
                + " de cinta i te'n sobraran %d.\n\n",
                nom, perimetreTerra, metresGastar, metresSobren);

        System.out.printf("Sobrarà un %.1f%% de la cinta comprada.\n",
                percentatgeMetresSobrant);
        System.out.printf("S'aprofitarà un %.1f%% de la pintura comprada.\n",
                percentatgeLitresUsats);
    }

}
