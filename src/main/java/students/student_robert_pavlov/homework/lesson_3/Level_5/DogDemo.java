package main.java.students.student_robert_pavlov.homework.lesson_3.Level_5;

public class DogDemo {

    public static void main(String[] args) {

       Dog myDog = new Dog (" Doggy ", 1," red ");

       myDog.voice();
       System.out.println(" Dogs age after birthday will be: " + myDog.happyBirthday());
       myDog.voice2();
       myDog.changeColor();
    }

}
