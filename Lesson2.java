/**
* Java 1. Lesson2
*
* @author Igor Shirokov
* @version 07.11.2021
*
*/
public class Lesson2 {

    public static void main(String[] args) {
    
        System.out.println(amount(6, 5));
        System.out.println(checkNumber(-2));
        System.out.println(checkNumberBoolean(4));
        checkNumberString();
        System.out.println(seasons(8));
    }
    
    static boolean amount(int a, int b) {
    
        int sum = a + b;
         
        if ( sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
        
    }

    static String checkNumber(int a) {
    
        return "Число - " +(a >= 0? "Положительное" : "Отрицательное");
    }
    
    static boolean checkNumberBoolean(int x) {
        
        int y;
        
        if(x >= 0) {
            return false;
        } else {
            return true;
        }
    }
    
    static void checkNumberString() {
        
        for (int a = 0; a < 6; a++) {
            for (int b = 0; b < 10; b++){
                System.out.print("Учим Java. ");
            }
            System.out.println();
        }

    }
    static boolean seasons(int a) {
        
         if(a % 4 == 0) {
            return true;
        } else if (a % 400 == 0) {
            return false;
        } else if(a % 100 == 0) {
            return false;
        } else {
            return false;
        }
        
    }
}