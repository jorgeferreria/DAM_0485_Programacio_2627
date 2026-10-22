package _05_casting;

public class _05_Casting {

    public static void main(String[] args) {

        long varLong = (long) 10000000000000.0;

        int a = 7, b = 2;

        double div = (double) a / b;

        System.out.println(div);

        int num = 5;
        switch (num) {
            case 5 -> {
                System.out.println("a");
                System.out.println("Adeu");
            }
            case 6 -> System.out.println("B");
            default -> System.out.println("C");
        }
    }

}
