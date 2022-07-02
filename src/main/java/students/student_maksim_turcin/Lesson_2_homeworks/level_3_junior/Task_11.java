package main.java.students.student_maksim_turcin.Lesson_2_homeworks.level_3_junior;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number1: ");

        double number1 = scanner.nextDouble();

        System.out.println("Please, enter number2: ");

        double number2 = scanner.nextDouble();

        System.out.println("Please, enter number3: ");

        double number3 = scanner.nextDouble();

        System.out.println("Arithmetic average is ");

        System.out.println( (number1 + number2 + number3) / 3.0D);

    }
}
