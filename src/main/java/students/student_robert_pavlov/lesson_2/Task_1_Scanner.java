package main.java.students.student_robert_pavlov.lesson_2;

import java.util.Scanner;

public class Task_1_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter 1st number: ");

        int firstNumber = input.nextInt();

        System.out.println("Please, enter second number");

        int secondNumber = input.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));


    }
}

