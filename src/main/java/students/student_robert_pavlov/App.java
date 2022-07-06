package main.java.students.student_robert_pavlov;

public class App {

    public static void main(String [] args) {

        Dog myDog = new Dog();
        Dog yourDog = new Dog();

        System.out.println("Woof woof woof!");

        yourDog.speak();
        yourDog.greetings();

        myDog.name = "Stan";
        myDog.age = 3;

        myDog.greetings();
        System.out.println("MyDog age after two years will be: " + myDog.yearsAfterTwoYears());

    }
}
