package pkg12_a04_bucles1;

import java.util.Scanner;

public class Act3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numero1 = 0, numero2 = 0;
        char operacio;
        boolean sortir = false;
        
        System.out.println("Dis-me el primer número: ");
        numero1 = sc.nextDouble();
        
        System.out.println("Dis-me el segon número: ");
        numero2 = sc.nextDouble();

        do {
            System.out.println("Dis-me l'operació (+, -, *, /, s/S (sortir)) :");
            operacio = sc.nextLine().toLowerCase().charAt(0);

            switch (operacio) {
                case '+':
                    System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    break;
                    
                case '-':
                    System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    break;
                    
                case '*':
                    System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                    break;
                    
                case '/':
                    if (numero2 != 0) {
                        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    } else {
                        System.out.println("El segon valor no pot ser 0");
                    }
                    break;
                    
                case 's':
                    sortir = true;
                    System.out.println("Et trobarem a faltar!!!!!");
                    break;
                    
                default:
                    System.out.println("Opció no vàlida!");
                    break;
            }
            
        } while (!sortir);

    }

}
