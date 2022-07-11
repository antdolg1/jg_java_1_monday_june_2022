package main.java.students.student_Martin_Valba.lesson_3;

public class App {

    public static void main(String[] args) {

         Dog myDog = new Dog();
         Dog yourDog = new Dog(2, "Mart", 34);

         System.out.println("Woof woof woof!");

         yourDog.speak();
         yourDog.greetings();

         myDog.name = "Sten";
         myDog.age = 4;

         myDog.greetings();
         System.out.println("myDog age after two years will be: " + myDog.yearsAfterTwoYears());
    }
}
