package main.java.students.student_Edik_Gerasimchuk.Lesson_3;

public class App {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        Dog yourDog = new Dog(2,"Jhon",30);

        System.out.println("Woof woof woof!");

        yourDog.speak();
        yourDog.greetings();

        myDog.name = "Stan";
        myDog.age = 4;

        myDog.greetings();
        System.out.println("Stans age after two years will be: " + myDog.yearsAfterTwoYears());

    }

}
