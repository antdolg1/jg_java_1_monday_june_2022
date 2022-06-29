package main.java.students.student_maksim_turcin.Lesson_2_homeworks.level_1_intern;

import java.util.Scanner;

public class ScannerProgram2 {
    public static void main(String[] args) {

        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Enter a digit");

        double firstDoubleNumber = scannerInput.nextDouble();

        double secondDoubleNumber = scannerInput.nextDouble();

        System.out.println(firstDoubleNumber + secondDoubleNumber);

        System.out.println(firstDoubleNumber - secondDoubleNumber);

        System.out.println(firstDoubleNumber * secondDoubleNumber);

        System.out.println(firstDoubleNumber / secondDoubleNumber);

    }
}
