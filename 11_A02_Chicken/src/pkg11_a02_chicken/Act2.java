package pkg11_a02_chicken;

public class Act2 {

    public static void main(String[] args) {
        // VARAIBLES
        int ousDillus = 100, ousDimarts = 121, ousDimecres = 117; 
        final int diasMes = 30;
        double dailyAverage, monthlyAverage, totalDies = 3.0, beneficioOu = 0.18
                , beneficioMes;
        
        // CODI
        dailyAverage = (ousDillus + ousDimarts + ousDimecres) / totalDies;
        monthlyAverage = dailyAverage * diasMes;
        // diasMes = 5; // ERROR CONSTANTE
        beneficioMes = monthlyAverage * beneficioOu;
        
        System.out.println(" Total de dinerito: " + beneficioMes);
    }
    
}
