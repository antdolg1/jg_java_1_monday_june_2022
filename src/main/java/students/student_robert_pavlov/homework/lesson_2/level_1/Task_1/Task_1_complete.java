package main.java.students.student_robert_pavlov.homework.lesson_2.level_1.Task_1;

import java.util.Scanner;

public class Task_1_complete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter 1st number: ");

        int firstNumber = scanner.nextInt();

        System.out.println("Please, enter second number: ");

        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));

        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));

        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

    }
}
