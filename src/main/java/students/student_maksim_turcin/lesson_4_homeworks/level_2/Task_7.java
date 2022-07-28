package main.java.students.student_maksim_turcin.lesson_4_homeworks.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a first number :");
        int number1 = scanner.nextInt();
        System.out.println("Give me a second number :");
        int number2 = scanner.nextInt();

        if (number1 > number2 != number1 < number2) {   // Поменял ||  на !=
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
