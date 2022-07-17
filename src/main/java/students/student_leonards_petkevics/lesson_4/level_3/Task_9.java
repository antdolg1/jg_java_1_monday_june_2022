package main.java.students.student_leonards_petkevics.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
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

        if (x < y && y < a && x < a) {
            System.out.println("numbers are in increasing order");
        } else if (x > y && y > a && a < x) {
            System.out.println("numbers are in decreasing order");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
