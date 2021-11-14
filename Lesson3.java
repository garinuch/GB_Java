/**
*  Java 1. Lesson3
*
*  @author Igor Shirokov
*
*  @version 12.11.2021
*
*/
import java.util.Arrays;

public class Lesson3 {
    
    public static void main(String[] args) {
        
        arr1();
        arr2();
        arr3();
        arr4();
        arr5(3, 5);
        arr6();
    }
    
    static void arr1() {
        
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            arr[i] = (arr[i] == 0)? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void arr2() {
        
        int[] arr = new int[100];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] = i + 1);
        }
    }
    
    static void arr3() {
        
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }
    
    static void arr4() {
    
        int[][] arr = new int[8][8];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i == arr.length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
        System.out.println();
        } 
    }
    
    static int[] arr5(int len, int initialValue) { 
        
         int [] arr = new int[len];
        
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = initialValue;
                System.out.println(arr); 
        }
        return arr;
    }
    
    public static void arr6() {
        
        int [] loc = { 25, 47, 11, 52, 232, 4, 8 ,2 };
        int max = loc[0];
        int min = loc[0];
         
        for (int i = 0; i != loc.length; i ++){
            
            if (loc[i] > max) {
                max = loc[i];
            }
            if (loc[i] < min) {
                min = loc[i];
            }
        }
        System.out.println("min -" + min + "\nmax -" + max);
    }
    
}
