package main.java.students.student_alisa_sinavska.lesson_4.homework.level_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
