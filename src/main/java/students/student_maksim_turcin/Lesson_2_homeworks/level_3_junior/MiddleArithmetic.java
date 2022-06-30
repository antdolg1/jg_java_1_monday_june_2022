package main.java.students.student_maksim_turcin.Lesson_2_homeworks.level_3_junior;

import java.util.Scanner;

public class MiddleArithmetic {

    public static void main(String[] args) {

        Scanner scnNumber = new Scanner(System.in);

        System.out.println("Enter three numbers ");

          double number1 = scnNumber.nextDouble();

          double number2 = scnNumber.nextDouble();

          double number3 = scnNumber.nextDouble();

          System.out.println("Middle number is ");

          System.out.println( (number1 + number2 + number3) / 3);

    }
}
