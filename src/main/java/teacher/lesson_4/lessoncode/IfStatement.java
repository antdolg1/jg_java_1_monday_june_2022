package main.java.teacher.lesson_4.lessoncode;

public class IfStatement {

    public static void main(final String[] args) {

        final int number = 34;

        if (number < 20) {
            System.out.println("Number is less than 20!");
        }

        System.out.println("____________________");

        if (number > 20) {
            System.out.println("Number is bigger than 20!");
        }

        System.out.println("____________________");

        int number2 = -10;

        if (number2 > 0) {
            System.out.println("Number2 is greater than 0");
        } else {
            System.out.println("Number2 is negative");
        }

        System.out.println("____________________");

        int age = 18;
        if (age == 18) {
            System.out.println("Явитесь в военкомат");
        } else {
            System.out.println("Всё равно явитесь");
        }

    }

}
