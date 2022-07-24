package main.java.students.student_maksim_turcin.lesson_2_homeworks.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit a two digits:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        int subtraction = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);

        int multiplication = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);

        int division = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
    }
}
