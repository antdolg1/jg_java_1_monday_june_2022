package main.java.students.student_Edik_Gerasimchuk.Lesson_4.Level_1;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");

        System.out.println("Write an integer :");

        int firstNumber = scanner.nextInt();

        System.out.println("Your number = " + firstNumber % 2);

        if (firstNumber % 2 == 0) {

            System.out.println("Your number is POSITIVE");

        } else if (firstNumber % 2 > 0 || firstNumber % 2 < 0) {

            System.out.println("Your number is NEGATIVE");

        }
    }
}