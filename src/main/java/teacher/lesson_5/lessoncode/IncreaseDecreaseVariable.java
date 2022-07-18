package main.java.teacher.lesson_5.lessoncode;

public class IncreaseDecreaseVariable {

    public static void main(String[] args) {

        int numberA = 0;

        numberA++;

        System.out.println("numberA value is: " + numberA);

        numberA = numberA + 1; //== numberA++;

        System.out.println("numberA value is: " + numberA);

        numberA--; // == numberA = numberA - 1;
        numberA--;

        System.out.println("numberA value is: " + numberA);
    }

}
