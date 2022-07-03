package main.java.students.student_robert_pavlov.lesson_2.Task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first number: ");

        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Please, enter second number: ");

        double secondDoubleNumber = scanner.nextDouble();

        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + (firstDoubleNumber - secondDoubleNumber));

        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + (firstDoubleNumber * secondDoubleNumber));

        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + (firstDoubleNumber / secondDoubleNumber));

        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + (firstDoubleNumber + secondDoubleNumber));
    }
}
