package main.java.students.student_leonards_petkevics.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        int x;
        int y;
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();
        System.out.print("Enter third number: ");
        a = input.nextInt();

        if (x == y && a == y && x == a) {
            System.out.println("All numbers are equal");
        } else if (x != y && y != a && a != x) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
