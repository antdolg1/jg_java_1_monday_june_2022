package main.java.students.student_leonards_petkevics.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
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

        if (x > y && x > a) {
            System.out.println("First number is biggest");
        } else if (x < y && y > a) {
            System.out.println("Second number is biggest");
        }
        else if (a > x && a > y) {
            System.out.println("Third number is biggest");
        }
    }
}
