
public class WorkApp {
    public static void main(String[] args) {
	
	printThreeWords();
	checkSumSign();
	printColor();
	compareNumbers();
	
	}
	
	static void printThreeWords() {
	    System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	
	}
	
	
	static void checkSumSign() {
	    int a = 15; 
	    int b = -6;
	
	    System.out.println("Сумма - " +(a + b >= 0? "Положительная" : "Отрицательная"));
	}
	
	static void printColor() {
	
	    int c = 0;
	
	    String[]colorName = {"Красный.", "Жёлтый.", "Зелёный."};
	
	    if(c == 0){
		System.out.println(colorName[0]);
	    }
	
	    if(c > 0 && c <= 100) {
	    System.out.println(colorName[1]);
	    }
	    if(c > 100) {
	    System.out.println(colorName[2]);
	    }
	}
	
	static void compareNumbers() {
	 	
	    int a = 10;
	    int b = 11;
	
	    if(a >= b){
	    System.out.println(a + ">=" + b);
	    } else {
	    System.out.println(a + "<" + b);
	    }
	} 
	
	
}





