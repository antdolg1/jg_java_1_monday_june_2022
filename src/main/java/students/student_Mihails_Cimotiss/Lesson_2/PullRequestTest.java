package main.java.students.student_Mihails_Cimotiss.Lesson_2;

import java.util.Scanner;

public class PullRequestTest {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();

            Scanner scanner2 = new Scanner(System.in);
        double secondDoubleNumber = scanner2.nextDouble();

            System.out.println("Your fist input was: " + firstDoubleNumber + "; Your second input was: " + secondDoubleNumber);
            System.out.println("Let us continue with this data and  perform some mathematical actions on it!");
            System.out.println("Addition: " + (firstDoubleNumber + secondDoubleNumber));
            System.out.println("Subtraction: " + (firstDoubleNumber - secondDoubleNumber));
            System.out.println("Multiplication: " + (firstDoubleNumber * secondDoubleNumber));
            System.out.println("Division: " + (firstDoubleNumber / secondDoubleNumber));
            System.out.println("Go again?");
            System.exit(0);
        }
}
