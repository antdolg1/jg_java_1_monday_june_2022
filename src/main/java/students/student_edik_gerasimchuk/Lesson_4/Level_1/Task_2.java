package main.java.students.student_Edik_Gerasimchuk.Lesson_4.Level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");

        System.out.println("Write an integer :");
        int firstNumber = scanner.nextInt();

        if (firstNumber > 0) {
            System.out.println("Your number is POSITIVE");

        } else if (firstNumber == 0) {
            System.out.println("Your number is EQUAL to 0");
        } else {
            System.out.println("Your number is NEGATIVE");
        }
    }
}
