package main.java.students.student_alisa_sinavska.lesson_4.homework.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Write second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Write third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println(secondNumber);
        } else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
            System.out.println(thirdNumber);
        }
    }
}
