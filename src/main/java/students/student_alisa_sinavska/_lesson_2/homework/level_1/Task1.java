package main.java.students.student_alisa_sinavska._lesson_2.homework.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Write second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum result: " + (firstNumber + secondNumber));
        System.out.println("Dif result: " + (firstNumber - secondNumber));
        System.out.println("Mult result: " + (firstNumber * secondNumber));
        System.out.println("Div result: " + (firstNumber / secondNumber));
    }
}