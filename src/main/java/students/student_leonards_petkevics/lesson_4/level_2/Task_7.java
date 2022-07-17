package main.java.students.student_leonards_petkevics.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        if (x == y) {
            System.out.println("Numbers are equals!");
        } else if (x != y) {
            System.out.println("Numbers are different");
        }
    }
}
