package main.java.students.student_Nikita_Bondars.Lesson_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstDoubleNumber,
               secondDoubleNumber,
               thirdDoubleNumber,
               sumResult;

        System.out.println("Welcome");

        System.out.print("Input 1st number : ");
        firstDoubleNumber = scanner.nextDouble();

        System.out.print("Input 2nd number : ");
        secondDoubleNumber = scanner.nextDouble();

        System.out.print("Input 3rd number : ");
        thirdDoubleNumber = scanner.nextDouble();

        sumResult = firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber / 3;

        System.out.println("---------------------");
        System.out.println("Avarage " + sumResult);

    }
}
