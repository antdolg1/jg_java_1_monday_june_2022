package main.java.students.student_maksim_turcin.lesson_2_homeworks.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit a three digits:");

        System.out.print("Please, enter 1st number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Please, enter 2nd number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Please, enter 3rd number: ");
        double number3 = scanner.nextDouble();

        double arithmeticAverage = ((number1 + number3  + number2) / 3);
        System.out.println("Arithmetic average number is: " + arithmeticAverage);
    }
}
