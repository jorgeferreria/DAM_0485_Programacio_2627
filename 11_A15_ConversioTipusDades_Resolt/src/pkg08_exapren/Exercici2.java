package pkg08_exapren;

/**
 * EXERCICI Obtenir el valor enter associat a les vocals 'a', 'e', 'i', 'o','u'.
 *
 * Al mostrar el resultat utilitza el caràcter d'escapament '\t' per separar la
 * lletra del seu valor numèric. La sortida hauria de ser semblant a això:
 *
 * a	97
 *
 * e	101
 *
 * i	105
 *
 * o	111
 *
 * u	117
 */
public class Exercici2 {

    public static void main(String[] args) {

        System.out.println("a\t" + (int) 'a');
        System.out.println("e\t" + (int) 'e');
        System.out.println("i\t" + (int) 'i');
        System.out.println("o\t" + (int) 'o');
        System.out.println("u\t" + (int) 'u');

        System.out.println();
        System.out.printf("lletra %c \tvalor %d%n", 'a', (int) 'a');

    }

}
