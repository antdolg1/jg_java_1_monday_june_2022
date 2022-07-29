package main.java.students.student_Mihails_Cimotiss.Lesson_2.homework.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final double firstDoubleNumber = scanner.nextDouble();

        final Scanner scanner2 = new Scanner(System.in);
        final double secondDoubleNumber = scanner2.nextDouble();

        System.out.println("Your fist input was: " + firstDoubleNumber + "; Your second input was: " + secondDoubleNumber);
        System.out.println("Let us continue with this data and  perform some mathematical actions on it!");
        System.out.println("Addition: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Subtraction: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Multiplication: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Division: " + (firstDoubleNumber / secondDoubleNumber));
        System.out.println("Go again?");
    }
}
