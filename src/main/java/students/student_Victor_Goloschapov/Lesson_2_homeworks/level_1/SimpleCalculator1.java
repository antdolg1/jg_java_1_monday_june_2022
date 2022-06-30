//Task_1
package Lesson_2_homeworks.level_1;
import java.util.Scanner;

public class SimpleCalculator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,
            num2,
            sumResult,
            substResult,
            divideResult,
            multResult;

        System.out.println("Welcome to simple calculator\n");

        System.out.print("Please enter number 1: ");
        num1 = input.nextInt();

        System.out.print("Please enter number 2: ");
        num2 = input.nextInt();

        sumResult = num1 + num2;
        substResult = num1 - num2;
        divideResult = num1 / num2;
        multResult = num1 * num2;

        System.out.println("\n");
        System.out.println("Calculation results:");
        System.out.println("=================================");
        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtraction result: " + substResult);
        System.out.println("Division result: " + divideResult);
        System.out.println("Multiplication result: " + multResult);
    }
}
