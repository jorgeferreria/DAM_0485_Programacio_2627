package pkg08_exapren;

import java.util.Scanner;

/**
 * EXERCICI 1
 *
 * Fer un programa que demani la temperatura i pressió amb valors decimals i que
 * s'emmagatzemin en variables de tipus int, realitzant les conversions
 * explícites que es necessitin.
 *
 * S'han de mostrar per pantalla les dades de temperatura i pressió introduïdes
 * convertides al tipus int.
 *
 */
public class Exercici1 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int temperatura, pressio;

        System.out.println("Digues la temperatura amb decimals: ");
        temperatura = (int) lector.nextDouble();

        System.out.println("Digues la pressió amb decimals: ");
        pressio = (int) lector.nextDouble();

        System.out.println("La temperatura entera és : " + temperatura);

        System.out.println("La pressió entera és : " + pressio);
    }
}
