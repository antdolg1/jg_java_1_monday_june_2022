package main.java.students.student_mike_jermakov.homework.lesson_4_homework;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is posotive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number equals zero");
        }
    }

}