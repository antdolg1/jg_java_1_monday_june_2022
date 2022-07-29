package main.java.students.student_robert_pavlov.homework.lesson_5.Task_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


    }

}
