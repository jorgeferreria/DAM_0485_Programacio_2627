package _06_condicionals;

public class _06_Condicionals {

    public static void main(String[] args) {
        int nota = 3; // -3 0 3 6 10 13
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
        System.out.println("FI");

    }

}
