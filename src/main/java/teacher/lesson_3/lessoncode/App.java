package main.java.teacher.lesson_3.lessoncode;

public class App {

    public static void main(final String[] args) {

        Dog myDog = new Dog();
        Dog yourDog = new Dog(2, "John", 30);

        System.out.println("Woof woof woof!");

        yourDog.speak();
        yourDog.greetings();

        myDog.name = "Stan";
        myDog.age = 3;

        myDog.greetings();
        System.out.println("myDog age after two years will be: " + myDog.yearsAfterTwoYears());


    }
}
