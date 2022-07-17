package main.java.students.student_Edik_Gerasimchuk.Lesson_4.Level_1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");

        System.out.println("Write an integer :");
        int firstNumber = scanner.nextInt();


        if (firstNumber == 1) {
            System.out.println("MONDAY");
        } else if (firstNumber == 2) {
            System.out.println("TUESDAY");
        } else if (firstNumber == 3) {
            System.out.println("WEDNESDAY");
        } else if (firstNumber == 4) {
            System.out.println("THURSDAY");
        } else if (firstNumber == 5) {
            System.out.println("FRIDAY");
        } else if (firstNumber == 6) {
            System.out.println("SATURDAY");
        } else if (firstNumber == 7) {
            System.out.println("SUNDAY");
        } else {
            System.out.println("You can use only numbers from 1-7");
        }

    }
}

