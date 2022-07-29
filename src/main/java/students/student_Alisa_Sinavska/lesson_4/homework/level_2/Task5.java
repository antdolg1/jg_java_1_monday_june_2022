package main.java.students.student_alisa_sinavska.lesson_4.homework.level_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Write second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Max number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Max number is: " + secondNumber);
        } else {
            System.out.println("First number = Second number = " + firstNumber);
        }
    }
}