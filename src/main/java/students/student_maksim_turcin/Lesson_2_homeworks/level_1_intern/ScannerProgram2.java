package main.java.students.student_maksim_turcin.Lesson_2_homeworks.level_1_intern;

import java.util.Scanner;

public class ScannerProgram2 {
    public static void main(String[] args) {

        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Enter a 2 digits");

        double firstNumber = scannerInput.nextDouble();

        double secondNumber = scannerInput.nextDouble();

        System.out.println(" + = " + firstNumber + secondNumber);

        System.out.println(" - = " + (firstNumber - secondNumber));

        System.out.println(" * = " + firstNumber * secondNumber);

        System.out.println(" / = " + firstNumber / secondNumber);

    }
}
