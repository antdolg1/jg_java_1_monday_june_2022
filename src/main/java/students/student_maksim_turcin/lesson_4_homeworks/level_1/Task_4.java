package main.java.students.student_maksim_turcin.lesson_4_homeworks.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number :");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is Even!");
        } else {
            System.out.println("Number is Odd!");
        }
    }
}
