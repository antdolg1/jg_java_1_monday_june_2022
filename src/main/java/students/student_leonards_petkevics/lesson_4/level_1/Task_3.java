package main.java.students.student_leonards_petkevics.lesson_4.levle_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number from 1 -7: ");
        x = input.nextInt();
        if (x == 1) {
            System.out.println("Monday!");
        } else if (x == 2) {
            System.out.println("Tuesday!");
        } else if (x == 3) {
            System.out.println("Wednesday!");
        } else if (x == 4) {
            System.out.println("Thursday!");
        } else if (x == 5) {
            System.out.println("Friday!");
        } else if (x == 6) {
            System.out.println("Saturday!");
        } else if (x == 7) {
            System.out.println("Sunday!");
        }
    }
}
