package _02_printf;

public class _02_printf {

    public static void main(String[] args) {
        double preuTotal = 34;
        int altura = 172;
        String nom1 = "Joan Miquel", cognom1 = "Llac";

        double notaM7 = 7.5793, notaM9 = 8;

        System.out.format("M7 %6.2f i M9 %5.2f  \n", notaM7, notaM9); 
        
        System.out.format("Alumne/a: %13s %-10s -> aprovat", nom1, cognom1);

        System.out.format("El preu és %.2f euros i el doble es %.4f\n",
                preuTotal, preuTotal * 2);

        System.out.printf("%2d\n", altura);

    }

}
