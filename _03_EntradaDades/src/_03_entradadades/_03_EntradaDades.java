package _03_entradadades;

import java.util.Scanner;

public class _03_EntradaDades {

    
    public static void main(String[] args) {
        
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        String nom;
        char inicial;
        int edad;
        double altura;
        boolean mayorEdad;
        
        // CODI
        System.out.print("Dime tu edad: ");
        edad = lector.nextInt();
        
        // BUIDAR BUFFER
        lector.nextLine(); // Elimina el salto de linia que queda en buffer
        // después del nextInt()
        
        System.out.print("Dime tu nombre: ");
        nom = lector.nextLine();
        
        System.out.print("Dime tu inicial: ");
        inicial = lector.nextLine().charAt(0); // CHAR
        
        System.out.print("Dime tu altura: ");
        altura = lector.nextDouble();
        
        System.out.print("¿Eres mayor de edad? ");
        mayorEdad = lector.nextBoolean(); // true false
        
        System.out.println("Hola " + nom + " con inicial " + inicial 
                + " tienes " + edad + " años " + ", mides " + altura 
                + " metros y ¿eres mayor de edad? " + mayorEdad);
        
    }
    
}
