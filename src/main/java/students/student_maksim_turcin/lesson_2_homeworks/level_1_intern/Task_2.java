package main.java.students.student_maksim_turcin.lesson_2_homeworks.level_1_intern;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Enter a 2 digits ");

        double firstNumber = scannerInput.nextDouble();

        double secondNumber = scannerInput.nextDouble();

        double sum = firstNumber + secondNumber;

        double subtract = firstNumber - secondNumber;

        double divide = firstNumber / secondNumber;

        double multiply = firstNumber * secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        System.out.println(firstNumber + " - " + secondNumber + " = " + subtract);

        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);

        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);

    }
}
