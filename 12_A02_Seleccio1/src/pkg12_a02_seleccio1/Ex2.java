package pkg12_a02_seleccio1;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        int num1, num2;

        // CODI
        System.out.print("Introdueix el primer número (enter): ");
        num1 = lector.nextInt();
        System.out.print("Introdueix el segon número (enter): ");
        num2 = lector.nextInt();

        if (num1 != num2) { // Si són diferentes
            if (num1 > num2) { // Si num1 és major
                System.out.printf("%d és més gran que %d", num1, num2);
                if (num1 % num2 == 0) { // Si num1 és múltiple de num2 
                    System.out.printf(", i %d és múltiple de %d\n", num1, num2);
                } else { // Si num1 no és múltiple de num2
                    System.out.printf(", i %d NO és múltiple de %d\n", num1, num2);
                }
            } else { // Si num2 és major
                System.out.printf("%d és més petit que %d", num1, num2);
                if (num2 % num1 == 0) { // Si num2 és múltiple de num1
                    System.out.printf(", i %d és múltiple de %d\n", num2, num1);
                } else { // Si num2 no és múltiple de num1
                    System.out.printf(", i %d NO és múltiple de %d\n", num2, num1);
                }
            }
        } else { // Si són iguals
            System.out.println("Els nombres són iguals!");
        }

        /*
Fer un programa en Java que demani dos nombres enters, diferents, 
        per l'entrada estàndard. El programa ha d’indicar quin és més gran 
        i si un és múltiple de l’altre.
         */
    }

}
