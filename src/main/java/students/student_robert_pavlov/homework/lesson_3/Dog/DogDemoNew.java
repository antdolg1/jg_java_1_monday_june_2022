package main.java.students.student_robert_pavlov.homework.lesson_3.Dog;

public class DogDemoNew {

    public static void main(String[] args) {

       DogNew myDog = new DogNew(" Doggy ", 1," red ");

       myDog.voice();
       System.out.println(" Dogs age after birthday will be: " + myDog.happyBirthday());
       myDog.voice2();
       myDog.changeColor();
    }

}
