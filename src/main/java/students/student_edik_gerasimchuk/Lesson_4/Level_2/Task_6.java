package main.java.students.student_Edik_Gerasimchuk.Lesson_4.Level_2;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");

        System.out.println("Write a first number :");
        int firstNumber = scanner.nextInt();

        System.out.println("Write a second number :");
        int secondNumber = scanner.nextInt();
//Первый вариант поставить в скобках "!"
        if (!(firstNumber > secondNumber)) {
            System.out.println("The lowest number is: " + firstNumber);

        } else if (!(firstNumber < secondNumber)) {
            System.out.println("The lowest number is :" + secondNumber);

            System.out.println("Write a second number :");

            // int secondNumber = scanner.nextInt();

            // if (firstNumber < secondNumber) {
            //    System.out.println("The lowest number is: " + firstNumber);

            // } else if (firstNumber > secondNumber) {
            //    System.out.println("The lowest number is :" + secondNumber);

//Второй вариант поменять знаки местами "<" и ">" (У меня оба варианта работают =) )

        }
    }
}
