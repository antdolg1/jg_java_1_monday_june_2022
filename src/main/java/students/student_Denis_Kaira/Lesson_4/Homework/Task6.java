package main.java.students.student_Denis_Kaira.Lesson_4.Homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int number = scanner.nextInt();
        System.out.println("Enter another number 2 : ");
        int number2 = scanner.nextInt();

        if (number < number2) {
            System.out.print( number );
        } else {
            System.out.print( number2 );
        }
    }
}
