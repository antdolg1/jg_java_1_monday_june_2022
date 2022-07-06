package main.java.students.student_leonards_petkevics.lesson_3;

public class App {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Dog yourDog = new Dog(2, "John", 45);

        System.out.println("Woof woof woof!");

        yourDog.speak();
        yourDog.greeting();

        myDog.name = "Leo";
        myDog.age = 12;

        myDog.greeting();
        System.out.println("myDog age after two years will be: " +myDog.yearsAfterTwoYears());


    }
}
