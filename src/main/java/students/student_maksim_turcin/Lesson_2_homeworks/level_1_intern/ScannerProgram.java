package main.java.students.student_maksim_turcin.Lesson_2_homeworks.level_1_intern;

import java.util.Scanner;

public class ScannerProgram {
    public static void main(String[] args) {

        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Enter a digit");

        int firstNumber = scannerInput.nextInt();

        int secondNumber = scannerInput.nextInt();

        System.out.println(" + = " + firstNumber + secondNumber);

        System.out.println(" - = " + (firstNumber - secondNumber));

        System.out.println(" * = " + firstNumber * secondNumber);

        System.out.println(" / = " + firstNumber / secondNumber);

    }
}
