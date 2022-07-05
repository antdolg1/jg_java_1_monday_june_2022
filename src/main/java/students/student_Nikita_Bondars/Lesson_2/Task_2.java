package main.java.students.student_Nikita_Bondars.Lesson_2;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstDoubleNumber,
               secondDoubleNumber,
               sumResult,
               substResult,
               divideResult,
               multResult;

        System.out.println("Welcome");

        System.out.print("Enter 1st number : ");
        firstDoubleNumber = scanner.nextDouble();

        System.out.print("Enter 2nd number : ");
        secondDoubleNumber = scanner.nextDouble();

        sumResult = firstDoubleNumber + secondDoubleNumber;
        substResult = firstDoubleNumber - secondDoubleNumber;
        divideResult = firstDoubleNumber / secondDoubleNumber;
        multResult = firstDoubleNumber * secondDoubleNumber;

        System.out.println("Result : ");
        System.out.println("---------------------");
        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtraction result: " + substResult);
        System.out.println("Division result: " + divideResult);
        System.out.println("Multiplication result: " + multResult);
    }
}
