package main.java.students.student_maksim_turcin.lesson_2_homeworks.level_1;

import java.util.Scanner;

public class Task_2 {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter two digits: ");

         double firstDoubleNumber = scanner.nextDouble();
         double secondDoubleNumber = scanner.nextDouble();

         double sum = firstDoubleNumber + secondDoubleNumber;
         System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + sum);

         double subtraction = firstDoubleNumber - secondDoubleNumber;
         System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + subtraction);

         double multiplication = firstDoubleNumber * secondDoubleNumber;
         System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + multiplication);

         double division = firstDoubleNumber / secondDoubleNumber;
         System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + division);
     }
}
