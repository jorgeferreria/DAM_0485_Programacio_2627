package pkg12_a04_bucles1;

import java.util.Scanner;

public class Act2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        boolean salir = false;

        // BUCLE WHILE CON CONTROL BOOLEANO
//        while (!salir) {
//            System.out.print("Dis-me el número: ");
//            num = sc.nextInt();
//
//            if (num > 0) {
//                if (num == 0) {
//                    salir = true;
//                } else if (num % 3 == 0) {
//                    System.out.println(num + " és divisible!!!");
//                } else {
//                    System.out.println(num + " NO és divisible!!!");
//                }
//            }
//
//        }
//
//
//
        // BUCLE DO-WHILE
//        do {
//
//            System.out.print("Dis-me el número: ");
//            num = sc.nextInt();
//            if (num > 0) {
//                if (num == 0) {
//                    salir = true;
//                } else if (num % 3 == 0) {
//                    System.out.println(num + " és divisible!!!");
//                } else {
//                    System.out.println(num + " NO és divisible!!!");
//                }
//            }
//
//        } while (!salir);
//
//
//
        // BUCLE WHILE SIN CONTROL BOOLEANO
//        System.out.print("Dis-me el número: ");
//        num = sc.nextInt();
//
//        while (num != 0) {
//            if (num > 0) {
//                if (num % 3 == 0) {
//                    System.out.println(num + " és divisible!!!");
//                } else {
//                    System.out.println(num + " NO és divisible!!!");
//                }
//            }
//            System.out.print("Dis-me el número: ");
//            num = sc.nextInt();
//        }

        // BUCLE DO-WHILE SIN CONTROL BOOLEANO
        do {
            System.out.print("Dis-me el número (positiu) o 0 per sortir: ");
            num = sc.nextInt();

            if (num > 0) {
                if (num % 3 == 0) {
                    System.out.println(num + " és divisible!!!");
                } else {
                    System.out.println(num + " NO és divisible!!!");
                }
            }
        } while (num != 0);

        System.out.println("FI");

    }

}
