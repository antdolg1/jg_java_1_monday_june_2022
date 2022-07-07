package main.java.students.student_Edik_Gerasimchuk.Lesson_2.Homework.Lesson_2;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");

        System.out.println("Write first number: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Write second number");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Sum result: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Dif result: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Mult result: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Div result: " + (firstDoubleNumber / secondDoubleNumber));
    }
}
