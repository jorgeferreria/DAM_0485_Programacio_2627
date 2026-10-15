package pkg08_exapren;

public class Exercici3 {

    public static void main(String[] args) {

        byte valorByte1 = 10;
        byte valorByte2 = 2;

        char valorChar1 = 'a';
        char valorChar2 = 'b';

        int valorInt1 = 100;
        int valorInt2 = 200;

        long valorLong1 = 1000;
        long valorLong2 = 2000;

        float valorFloat1 = 1000.1234f;
        float valorFloat2 = 2000.5678f;

        double valorDouble1 = 100000.1234;
        double valorDouble2 = 200000.5678;

        int divisioByte;
        int caracters;

        long operacioLong;
        int castInt;
        int intDirecte;
        double operacioDouble;
        double divDouble;
        float castFloat;
        float floatDirecte;
        double result6;

        //1. Guarda a una variable el resultat de valorByte1 / valorByte2
        //sense fer cap conversió explícita (casting)
        divisioByte = valorByte1 / valorByte2;

        //2. Guarda a una variable el resultat de valorChar1 + valorChar2
        //sense fer cap conversió explícita (casting)
        caracters = valorChar1 + valorChar2;

        //3. Guarda a una variable de tipus "int" el resultat de
        //valorLong1 * valorLong2
        operacioLong = valorLong1 * valorLong2;
        castInt = (int) operacioLong;
        intDirecte = (int) (valorLong1 * valorLong2); //cal parèntesi!! 

        //4. Guarda a una variable el resultat de
        //(valorByte1 * valorLong2)/valorDouble1 sense fer
        //cap conversió explícita (casting)
        operacioDouble = (valorByte1 * valorLong2) / valorDouble1;

        //5. Guarda a una variable de tipus "float" el resultat de
        //(valorByte1 * valorLong2)/valorDouble1 
        divDouble = (valorByte1 * valorLong2) / valorDouble1;
        castFloat = (float) divDouble;
        //cal parèntesi!!
        floatDirecte = (float) ((valorByte1 * valorLong2) / valorDouble1);

        //6. Indica el tipus de la variable result6
        //RAONA LA RESPOSTA
        //result6 = valorChar1*valorFloat1 + (valorByte1 * valorLong2)/valorDouble1;
        result6 = valorChar1 * valorFloat1 + (valorByte1 * valorLong2) / valorDouble1;

        //double és l'últim tipus a la "cadena" de conversions implícites:
        //qualsevol tipus es pot convertir implícitament a double
    }
}
