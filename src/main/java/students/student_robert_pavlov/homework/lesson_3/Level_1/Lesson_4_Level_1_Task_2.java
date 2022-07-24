package main.java.students.student_robert_pavlov.homework.lesson_3.Level_1;

import java.util.Scanner;

public class Lesson_4_Level_1_Task_2 {
    public static void main(String[] args) {

        int number;
            System.out.println(" enter the number ");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number > 0) {
            System.out.println(" The number is positive ");
        } else if (number == 0) {
            System.out.println(" The number is zero ");
        } else if (number < 0) {
            System.out.println(" The number is negative ");
        }

    }
}
