package pkg12_a04_bucles1;

import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        int num, suma = 0;
        
        
        System.out.print("Dis-me el número positiu: ");
        num = sc.nextInt();
        
        while (num < 0){
            System.out.print("El nombre no pot ser negatiu!!!\nEscriu un nou nombre:");
            num = sc.nextInt();
        }
        
        System.out.println(num);
     
        for (int i = 1; i <= num; i++) {
             suma = suma + i;
        }
        // System.out.println(i); // ERROR
        System.out.println(suma);
    }
    
}
