package main.java.students.student_Martin_Valba.lesson_5.homework.level_2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Write first number: ");
        int firstNumber = scanner.nextInt();
        numbers[0] = firstNumber;

        System.out.println("Write second number: ");
        int secondNumber = scanner.nextInt();
        numbers[1] = secondNumber;

        System.out.println("Write third number: ");
        int thirdNumber = scanner.nextInt();
        numbers[2] = thirdNumber;

        System.out.println(numbers[0] + "\n" + numbers[1] + "\n" + numbers[2] + "\n");
    }
}
