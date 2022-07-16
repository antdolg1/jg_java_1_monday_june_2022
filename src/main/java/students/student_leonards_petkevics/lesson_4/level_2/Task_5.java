package main.java.students.student_leonards_petkevics.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        if (x > y) {
            System.out.println("First number is bigger than second!");
        } else if (x < y) {
            System.out.println("Second number is bigger than first");
        }
    }
}
