package main.java.students.student_Martin_Valba.lesson_4.homework.level_2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Write second number: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.print("Numbers are equals");
        } else {
            System.out.print("Numbers are different");
        }
    }
}
