package pkg12_a06_bucles3_validar;

import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final String PASSWORD_SECRET = "BONDIA!";
        String password = "";
        boolean continuar = true;
              
        do {
            System.out.print("Dis-me la teva contrasenya: ");
            password = sc.nextLine();
            
            if (password.equals(PASSWORD_SECRET)){
                continuar = false;
                System.out.println("Benvingut!!!! Has encertat la contrasenya!");
            } else {
                System.out.println("Has fallat, torna a intentar-ho!");
            }
        } while (continuar);
        

        /*
        Fer un programa que emmagatzemi en una variable la contrasenya “BONDIA!” 
        en una constant, i demani a l'usuari introduir-la fins que coincideixi. 
        Cada vegada que no coincideixi es mostrarà un missatge indicant que no és vàlida.
         */
    }

}
