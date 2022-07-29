package main.java.students.student_Martin_Valba.lesson_5.homework.level_2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        int oneNumber = scanner.nextInt();
        numbers[0] = oneNumber;

        int twoNumber = scanner.nextInt();
        numbers[1] = twoNumber;

        int threeNumber = scanner.nextInt();
        numbers[2] = threeNumber;

        System.out.println(oneNumber + "\n" + twoNumber + "\n" + threeNumber + "\n");
    }
}
