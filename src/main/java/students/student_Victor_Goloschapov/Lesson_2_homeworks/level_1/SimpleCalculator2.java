//Task_2
package Lesson_2_homeworks.level_1;
import java.util.Scanner;

public class SimpleCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstDoubleNumber,
               secondDoubleNumber,
               sumResult,
               substResult,
               divideResult,
               multResult;

        System.out.println("\n");
        System.out.println("Welcome to simple calculator v2.0\n===========================\n");

        System.out.print("Please enter fractional number 1: ");
        firstDoubleNumber = scanner.nextDouble();

        System.out.print("Please enter fractional number 2: ");
        secondDoubleNumber = scanner.nextDouble();

        sumResult = firstDoubleNumber + secondDoubleNumber;
        substResult = firstDoubleNumber - secondDoubleNumber;
        divideResult = firstDoubleNumber / secondDoubleNumber;
        multResult = firstDoubleNumber * secondDoubleNumber;

        System.out.println("\n");
        System.out.println("Below you can see calculation results\n===========================\n");
        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtraction result: " + substResult);
        System.out.println("Division result: " + divideResult);
        System.out.println("Multiplication result: " + multResult);
    }
}
