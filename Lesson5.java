/**
 *  Java 1. Lesson5
 *
 *  @author Igor Shirokov
 *
 *  @version 19.11.2021
 *
 */
public class Lesson5 {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
            persArray[0] = new Person("Neputeviy Ivan Aleksandrovich", "Engineer", "neput@mailbox.com", "892382312",5000,39);
            persArray[1] = new Person("Petrov Vasiliy Igorevich", "Creator", "petrov@mailbox.com", "892352314",55000,32);
            persArray[2] = new Person("Sidorov Maksim Petrovich", "Water pot", "sidorov@mailbox.com", "892312115",12000,22);
            persArray[3] = new Person("Kuritsyna Nadegda Vasilievna", "EnvelopeLicker", "kuritsyn@mailbox.com", "892612316",5000,41);
            persArray[4] = new Person("Bill Gates Windovosky", "Grinder", "bg@mailbox.com", "892312317",4000,60);
                for (Person person : persArray)
                    if (person.getAge() > 40)
                        System.out.println(person);
    }

}
class Person {
    private String name;
    private String presentPost;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String presentPost, String email, String phone, int salary, int age) {
        this.name = name;
        this.presentPost = presentPost;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return(name + "\n"+ presentPost + "\n"+ email + "\n"+phone + "\n"+ salary + "\n" + age);
    }
}