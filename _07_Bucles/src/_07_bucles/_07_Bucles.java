package _07_bucles;

import java.util.Scanner;

public class _07_Bucles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String PASS = "1234";
        String contra;

        for ( int i = 0; i < 10; i++ ) {

            System.out.println((i + 50000) + ". Hola");
        }

        System.out.print("Dime la contraseña: ");
        contra = sc.nextLine();

        while ( !contra.equals(PASS) ) {
            System.out.print("Dime la contraseña correcta: ");
            contra = sc.nextLine();
        }

    }

}
