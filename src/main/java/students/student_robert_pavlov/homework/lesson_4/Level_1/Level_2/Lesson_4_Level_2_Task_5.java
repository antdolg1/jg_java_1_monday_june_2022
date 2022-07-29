package main.java.students.student_robert_pavlov.homework.lesson_4.Level_1.Level_2;

import java.util.Scanner;

public class Lesson_4_Level_2_Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.printf("Between %d and %d, maximum is %d %n", a, b, a);
        } else {
            System.out.printf("Between %d and %d, maximum number is %d %n", a, b, b);
        }

    }
}
