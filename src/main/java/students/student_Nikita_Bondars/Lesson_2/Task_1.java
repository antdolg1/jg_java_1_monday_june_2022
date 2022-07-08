package main.java.students.student_Nikita_Bondars.Lesson_2;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,
            num2,
            sumResult,
            substResult,
            divideResult,
            multResult;

        System.out.println("Welcome");

        System.out.print("Enter 1st number : ");
        num1 = input.nextInt();

        System.out.print("Enter 2nd number : ");
        num2 = input.nextInt();

        sumResult = num1 + num2;
        substResult = num1 - num2;
        divideResult = num1 / num2;
        multResult = num1 * num2;

        System.out.println("Result : ");
        System.out.println("---------------------");
        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtraction result: " + substResult);
        System.out.println("Division result: " + divideResult);
        System.out.println("Multiplication result: " + multResult);
    }
}
