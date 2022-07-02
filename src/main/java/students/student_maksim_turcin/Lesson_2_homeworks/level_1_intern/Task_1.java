package main.java.students.student_maksim_turcin.Lesson_2_homeworks.level_1_intern;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Enter a two digits ");

        int firstNumber = scannerInput.nextInt();

        int secondNumber = scannerInput.nextInt();

        int sum = firstNumber + secondNumber;

        int subtract = firstNumber - secondNumber;

        int multiply = firstNumber * secondNumber;

        int  divide = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        System.out.println(firstNumber + " - "  + secondNumber + " = " + subtract);

        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);

        System.out.println(firstNumber + " / " +  secondNumber + " = " +  divide);

    }
}
