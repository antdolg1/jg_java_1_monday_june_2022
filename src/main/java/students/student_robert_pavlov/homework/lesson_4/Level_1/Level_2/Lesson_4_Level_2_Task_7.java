package main.java.students.student_robert_pavlov.homework.lesson_4.Level_1.Level_2;

import java.util.Scanner;

public class Lesson_4_Level_2_Task_7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
        System.out.print("Input third number: ");
        int z = in.nextInt();

        if (x == y && x == z) {
            System.out.println("All numbers are equal");
        } else if ((x == y) || (x == z) || (z == y)) {

        } else {
            System.out.println(" Numbers are different ");
        }
    }
}



