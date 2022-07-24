package main.java.students.student_Denis_Kaira.Lesson_4.Homework;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int number = scanner.nextInt();
        System.out.println("Enter number 2 : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number 3 : ");
        int number3 = scanner.nextInt();

        if (number < number2 && number2 < number3) {
            System.out.print("increasing");
        } else if (number > number2 && number2 > number3 ) {
            System.out.print("decreasing");
        } else {
            System.out.print("Neither increasing or decreasing order");
        }
    }
}

