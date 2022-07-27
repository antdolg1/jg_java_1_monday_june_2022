package main.java.students.student_alisa_sinavska._lesson_5.level_2;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Write second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Write third number: ");
        int thirdNumber = scanner.nextInt();

        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }

}

