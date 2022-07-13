package main.java.students.student_alisa_sinavska.lesson_4.homework.level_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Write second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Write third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
