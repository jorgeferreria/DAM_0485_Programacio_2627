package _06_condicionals;

import java.util.Scanner;

public class _06_Condicionals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = 7; // -3 0 3 6 10 13
        String cadena = "Hola a tots!", cadena2;
        
        cadena2 = sc.nextLine();
        
        if ( cadena.equals(cadena2) ) {
            System.out.println("iguals!");
        } else {
            System.out.println("diferents!");
        }
        
        if ( cadena.equalsIgnoreCase(cadena2) ) {
            System.out.println("iguals!");
        } else {
            System.out.println("diferents!");
        }
        
        if (nota < cadena.length()){
            System.out.println(cadena.toUpperCase().charAt(nota));
        }
        
        if (nota == Integer.parseInt("7")) {
           System.out.println("iguals!");
        } else {
            System.out.println("diferents!");
        }
        
        
        System.out.println("INICI");

        if (nota >= 0 && nota < 5) {
            System.out.println("Estas suspés!");
        } else if (nota >= 5 && nota < 9) {
            System.out.println("Estas aprovat!");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("SOBRESALIENT!!!!");
        } else {
            System.out.println("Nota no vàlida!");
        }

//        if (nota < 5) {
//            System.out.println("Estas suspés!");
//        }
        System.out.println("SWITCH");
        // SWITCH
        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Estas suspés!");
                System.out.println("Estudia més!");
                break;
            case 5, 6, 7, 8:
                System.out.println("Estas aprovat!");
                break;
            case 9, 10:
                System.out.println("SOBRESALIENT!!!!");
                break;
            default:
                System.out.println("Nota no vàlida!");
                break;
        }

        System.out.println("FI");

    }

}
