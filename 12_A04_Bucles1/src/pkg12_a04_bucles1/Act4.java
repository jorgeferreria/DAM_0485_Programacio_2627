package pkg12_a04_bucles1;

import java.util.Scanner;

public class Act4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;

        while (numero <= 0) {
            System.out.print("Dis-me el número: ");
            numero = sc.nextInt();
        }

        System.out.print("Els divisors de " + numero + " són: ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                if (i < numero){
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i+ "\n");
                }
            }
        }

    }

}
