package pkg08_exapren;

import java.util.Scanner;

/**
 * Exercici 4 ============== Escriu un programa que demani un valor del preu
 * d'un llibre (dada de tipus double) i mostrar el preu final (valor de tipus
 * float) resultat d'aplicar l'IVA (una constant tipus short de valor 21).
 *
 * Recordeu que per afegir un percentatge d'un valor al propi valor hem
 * d'aplicar la següent fòrmula: valorFinal = valor * ( 1 + percentatge / 100)
 *
 * Exemple Introduir el preu sense IVA: 100
 *
 * El preu final és 121,00€.
 */
public class Exercici4 {

    public static void main(String[] args) {
        Scanner llegit = new Scanner(System.in);
        final short IVA = 21;
        double senseIVA;
        float ambIVA;

        System.out.print("Preu del llibre sense IVA? ");
        senseIVA = llegit.nextDouble();

        ambIVA = (float) senseIVA * (1 + (float) IVA / 100);

        System.out.printf("Preu del llibre amb IVA: %.2f€\n", ambIVA);

    }

}
