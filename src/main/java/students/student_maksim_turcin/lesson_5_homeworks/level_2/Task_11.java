package main.java.students.student_maksim_turcin.lesson_5_homeworks.level_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        int[] numberS = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a first number: ");
        int firstNumberS = scanner.nextInt();
        System.out.println("Give me a second number: ");
        int SecondNumberS = scanner.nextInt();
        System.out.println("Give me a third number: ");
        int thirdNumberS = scanner.nextInt();

        numberS[0] = firstNumberS;
        numberS[1] = SecondNumberS;
        numberS[2] = thirdNumberS;

        System.out.println("Numbers: ");
        System.out.println(numberS[0]);
        System.out.println(numberS[1]);
        System.out.println(numberS[2]);
    }
}
