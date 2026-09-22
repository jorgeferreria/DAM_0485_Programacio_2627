package pkg11_a02_chicken;

public class Act1 {

    public static void main(String[] args) {
        
        // VARIABLES
        int ousPerGallina = 5, totalGallines = 3, 
                ousDilluns, ousDimarts = 0, ousDimecres = 0, ousTotal = 0;
                
        // CODI        
        ousDilluns = ousPerGallina * totalGallines;
        
        totalGallines = totalGallines + 1; // 4
        
        ousDimarts = ousPerGallina * totalGallines;
        
        totalGallines = totalGallines / 2; // 2
        
        ousDimecres = ousPerGallina * totalGallines;
        
        ousTotal = ousDilluns + ousDimarts + ousDimecres;
        
        System.out.println("Total ous " + ousTotal);
    }
    
}
