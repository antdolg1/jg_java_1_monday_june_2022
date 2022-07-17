package main.java.students.student_Edik_Gerasimchuk.Lesson_4.Level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");

        System.out.println("Write a first number :");
        int firstNumber = scanner.nextInt();

        System.out.println("Write a second number :");
        int secondNumber = scanner.nextInt();

        System.out.println("Write a third number :");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The largest number is: " + firstNumber);

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The largest number is :" + secondNumber);

        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The largest number is :" + thirdNumber);
        }else{
            System.out.println("Numbers are equal");
        }
    }
}
