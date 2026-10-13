package _04_operacionsbasiques;

public class _04_OperacionsBasiques {

    public static void main(String[] args) {
        
        int num = 0, edat = 10, altura = 130;
        
        //num++; // num = num + 1;
        
        num += 7; //num = num + 7;
        
        //num--; // num = num - 1;
        num -= 7; //num = num - 7;
        
        //System.out.println(num++);
        System.out.println(++num);
        
        System.out.println(num);
        
        System.out.println(edat > 15 && altura > 150);
        System.out.println(edat < 15 && altura > 150);
        System.out.println(edat < 15 && altura < 150);
        
        System.out.println("-------------------");
        
        System.out.println(altura < 150 || edat > 15 && altura > 150);
        System.out.println(edat < 15 || altura > 150);
        System.out.println(edat < 15 || altura < 150);
        
        
        
        
        
        
        
    }
    
}
