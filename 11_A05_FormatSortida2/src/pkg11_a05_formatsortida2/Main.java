package pkg11_a05_formatsortida2;

public class Main {

    public static void main(String[] args) {
        // VARIABLES
        double descompte21 = 0.21, descompte15 = 0.15, descompte5 = 0.05,
                preuSamarreta = 100, preuPantalo = 50, preuSabates = 60,
                descompteSamarreta, descomptePantalo, descompteSabates;        
        
        
        // CODI
        
        descompteSamarreta = preuSamarreta * descompte21; // 21
        descomptePantalo = preuPantalo * descompte15;
        descompteSabates = preuSabates * descompte5;
        
        System.out.printf("El preu de la samarreta és %.2f€, "
                + "i he pagat %.2f€ i m’he estalviat %.2f€. \n",
                preuSamarreta, preuSamarreta - descompteSamarreta, descompteSamarreta);

        System.out.printf("També m’he comprat un pantaló de %.2f€ per %.2f€  "
                + "i unes sabates de %.2f€ per %.2f€.\n",
                preuPantalo, preuPantalo - descomptePantalo,
                preuSabates, preuSabates - descompteSabates);
        
        System.out.printf("En total m’he estalviat %.2f€.\n",
                descomptePantalo + descompteSabates + descompteSamarreta);
/*
Hi ha una botiga que està fent una oferta de descompte en certes peces.
Totes les samarretes tenen un descompte del 21% sobre el preu real, els pantalons, 
        en canvi, porten un descompte del 15% sobre el preu real, les sabates del 
        5% sobre el preu real, i la resta d’articles de la botiga no tenen descompte.

Exemple de resultat

El preu de la samarreta és 100,00€, i he pagat 79,00€ i m’he estalviat 21,00€. 

També m’he comprat un pantaló de 50,00€ per 42,50€  i unes sabates de 60,00€ per 57,00€.  

En total m’he estalviat 31,50€.

*/

    }
    
}
