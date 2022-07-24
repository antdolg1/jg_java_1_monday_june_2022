package main.java.students.student_mike_jermakov.homework.lesson_4_homework;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.println(number1);
        } else if ( number2 < number1 ){
            System.out.println(number2);
        }
    }
}