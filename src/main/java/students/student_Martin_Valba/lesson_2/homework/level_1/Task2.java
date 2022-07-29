package main.java.students.student_Martin_Valba.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter doubleNumber : ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter secondDoubleNumber : ");
        double secondNumber = scanner.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}
