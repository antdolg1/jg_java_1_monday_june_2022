package main.java.students.student_Mihails_Cimotiss.Lesson_2.HomeworkAll;

import java.util.Scanner;

public class Lesson2Level1_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        System.out.println("Your fist input was: " + firstNumber + "; Your second input was: " + secondNumber);
        System.out.println("Let us continue with this data and perform some mathematical actions on it!");
        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / (double) secondNumber));
        System.out.println("Go again?");
    }
 }
