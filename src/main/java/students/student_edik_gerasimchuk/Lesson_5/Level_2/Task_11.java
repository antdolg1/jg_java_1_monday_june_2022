package main.java.students.student_Edik_Gerasimchuk.Lesson_5.Level_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int nums[] = new int[3];

        int c = nums[0] = 3;
        int g = nums[1] = 32;
        int b = nums[2] = 56;

        System.out.println("Enter number from 0 - 2: ");
        int firstNumber = scanner.nextInt();

        if (firstNumber == 0) {
            System.out.println(c);

        } else if (firstNumber == 1) {
            System.out.println(g);

        } else if (firstNumber == 2) {
            System.out.println(b);

        }


    }
}

