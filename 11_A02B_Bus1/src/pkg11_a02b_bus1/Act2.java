package pkg11_a02b_bus1;

public class Act2 {

    public static void main(String[] args) {
        
        // VARIABLES
        int pugenStop1 = 6, pugenStop2 = 8, pugenStop3 = 5, 
                numTrajectes = 15;
        double nombrePassatgersMitjanaRecorregut, nombrePassatgersMitjanaDia, 
                preuBillet = 1.20, recaptacio, parades = 3;
        
        //CODI
        
        // Calculo la mitjana de pasatgers per parada.
        nombrePassatgersMitjanaRecorregut = 
                (pugenStop1 + pugenStop2 + pugenStop3) / parades;
        
        // Calculo la mitjana de pasatgers per dia.
        nombrePassatgersMitjanaDia = nombrePassatgersMitjanaRecorregut * numTrajectes;
        
        // Calculo la recaptació diaria estimada
        recaptacio = nombrePassatgersMitjanaDia * preuBillet;
        
        System.out.println("Mitjana de passatjers per parada: " 
                + nombrePassatgersMitjanaRecorregut);
        
        System.out.println("Mitjana de passatjers per dia: " 
                + nombrePassatgersMitjanaDia);
        
        System.out.println("Recaptació mitjana " + recaptacio);
        
        
        
    }
    
}
