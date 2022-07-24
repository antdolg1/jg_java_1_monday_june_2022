package main.java.students.student_Martin_Valba.lesson_4.homework.level_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Number is equal to zero");
        } else if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        }
    }
}

