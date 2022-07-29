package main.java.students.student_alisa_sinavska.lesson_4.homework.level_2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Write second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
