package main.java.students.student_Martin_Valba.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter firstnumber : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter secondNumber : ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}
