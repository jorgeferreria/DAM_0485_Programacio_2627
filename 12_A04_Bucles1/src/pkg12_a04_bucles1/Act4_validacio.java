package pkg12_a04_bucles1;

import java.util.Scanner;

public class Act4_validacio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean pendentValidar = true;

        System.out.print("Introduce un entero mayor que 0: ");
        while (pendentValidar) {
            if (!sc.hasNextInt()) {
                System.out.print("Dato incorrecto, introduce un entero: ");
            } else {
                numero = sc.nextInt(); //es llegeix del buffer i s'assigna a num
                if (numero > 0) {
                    pendentValidar = false;
                } else {
                    System.out.print("Dato incorrecto, introduce un positivo: ");
                }
            }
            sc.nextLine(); // neteja la resta de la línia (dada errònia i \n, o només \n)
        }

        System.out.print("Els divisors de " + numero + " són: ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                if (i < numero) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + "\n");
                }
            }
        }
        System.out.println("FI");

    }

}
