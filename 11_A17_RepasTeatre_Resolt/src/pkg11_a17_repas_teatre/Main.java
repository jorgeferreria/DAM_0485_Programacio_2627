package pkg11_a17_repas_teatre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        final double PREU_REDUIT_TNC1 = 18.50, PREU_REDUIT_TNC2 = 28.50, 
                PREU_REDUIT_ROMEA = 29.50;
        
        final int MINIM_AVIS_35_AP = 35, PERCENTATGE_MINIM_AVIS = 50, 
                MINIM_AVIS_TNC = 40, MINIM_AVIS_TR= 30 , CENT = 100;
        
        boolean esReduitTNC1, esReduitTNC2, esReduitRomea;

        int numFinalTNC1, numFinalTNC2, numFinalRomea, 
                numInicialTNC1, numInicialTNC2, numInicialRomea, 
                percentFinalTNC1, percentFinalTNC2, percentFinalRomea;
        
        String casal;

        //dades per fer proves sense introduir-les per teclat
        /*
        numInicialTNC1 = 50;
        numInicialTNC2 = 40;
        numInicialRomea = 50;

        percentFinalTNC1 = 60;
        percentFinalTNC2 = 40;
        percentFinalRomea = 80;

        casal = "Rosa dels vents";
        */
        //
        //demanem les dades:
        
        System.out.println("Número d'interessats en el TNC1: ");
        numInicialTNC1 = lector.nextInt();
        System.out.println("Percentatge final al TNC1 (sobre 100): ");
        percentFinalTNC1 = lector.nextInt();

        System.out.println("Número d'interessats en el TNC2: ");
        numInicialTNC2 = lector.nextInt();
        System.out.println("Percentatge final al TNC2 (sobre 100): ");
        percentFinalTNC2 = lector.nextInt();

        System.out.println("Número d'interessats en el Romea: ");
        numInicialRomea = lector.nextInt();
        System.out.println("Percentatge final al Romea (sobre 100): ");
        percentFinalRomea = lector.nextInt();

        System.out.println("Nom sencer del casal vinculat a l'oferta: ");
        lector.nextLine();  //netejar buffer
        casal = lector.nextLine();
        
        //calcular apuntats:
        numFinalTNC1 = numInicialTNC1 * percentFinalTNC1 / CENT;
        numFinalTNC2 = numInicialTNC2 * percentFinalTNC2 / CENT;
        numFinalRomea = numInicialRomea * percentFinalRomea / CENT;

        //preu normal si numFinal és menys de 35 o percentatge menor o igual a 50
        esReduitTNC1 = numFinalTNC1 >= MINIM_AVIS_35_AP && percentFinalTNC1 > PERCENTATGE_MINIM_AVIS;
        esReduitTNC2 = numFinalTNC2 >= MINIM_AVIS_35_AP && percentFinalTNC2 > PERCENTATGE_MINIM_AVIS;
        esReduitRomea = numFinalRomea >= MINIM_AVIS_35_AP && percentFinalRomea > PERCENTATGE_MINIM_AVIS;

        //preu opcions
        System.out.printf("%n*** OFERTA PER AL CASAL \"%S\" ***%n%n", casal);
        System.out.printf("Preu TNC al galliner reduit (%.2f€)? %b "
                + "(%d avis apuntats, %d%%)\n",
                PREU_REDUIT_TNC1, esReduitTNC1, numFinalTNC1, percentFinalTNC1);

        System.out.printf("Preu TNC a platea reduit (%.2f€)? %b "
                + "(%d avis apuntats, %d%%)\n",
                PREU_REDUIT_TNC2, esReduitTNC2, numFinalTNC2, percentFinalTNC2);

        System.out.printf("Preu Teatre Romea reduit (%.2f€)? %b "
                + "(%d avis apuntats, %d%%)\n",
                PREU_REDUIT_ROMEA, esReduitRomea, numFinalRomea, percentFinalRomea);

        System.out.println("\n"
                + "Conclusió a partir de les dades: Podem anar al teatre? "
                + (numFinalTNC1 + numFinalTNC2 >= MINIM_AVIS_TNC 
                        && numFinalRomea >= MINIM_AVIS_TR));

    }

}
