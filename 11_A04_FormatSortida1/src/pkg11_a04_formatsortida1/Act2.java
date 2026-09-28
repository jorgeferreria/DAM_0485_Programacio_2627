package pkg11_a04_formatsortida1;

public class Act2 {

    public static void main(String[] args) {

        // VARIABLES
        int ordinadors = 25;
        double preu = 500.45, preuTotal;
        
        // CODI

        preuTotal = ordinadors * preu;
        
        System.out.printf("Hi ha %d ordinadors, el seu preu és %.2f € "
                + "i en total costen %.2f €\n", ordinadors, preu, preuTotal);

/*
Hi ha 25 ordinadors, el seu preu és 500,45 € i en total costen 12511,25 €
*/


    }
    
}
