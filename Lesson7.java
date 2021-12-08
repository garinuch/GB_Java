/**
 *  Java 1. Lesson7
 *
 *  @author Igor Shirokov
 *
 *  @version 02.12.2021
 *
 */
public class Lesson7 {
    public static void main(String[] args) {
        System.out.println("increase food by 10");
        Cat[] cats = {new Cat("Barsik", 7), new Cat("Murzik", 5), new Cat("Belka", 15)};
        Plate plate = new Plate(10);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println(plate);
        System.out.println("***********************************************");
        
        plate.increaseFood(10);
        System.out.println(plate);
        System.out.println("Cats eat :");
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }



    void eat(Plate plate) {
        if (plate.getAmountOfFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
    @Override
    public String toString() {
        return "cat: " + name + "    appetite: " + appetite + "    isFull: " + isFull;
    }
}

class Plate {
    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    @Override
    public String toString() {
        return "PLATE: " + amountOfFood;
    }

    void decreaseFood(int appetite) {
        if (amountOfFood >= appetite) {
            amountOfFood -= appetite;
        }
    }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void increaseFood(int amount) {
        amountOfFood += amount;
    }
}
