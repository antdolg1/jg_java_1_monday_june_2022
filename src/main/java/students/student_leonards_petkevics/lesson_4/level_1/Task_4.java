package main.java.students.student_leonards_petkevics.lesson_4.levle_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        x = input.nextInt();
        if (x % 2 > 0){
            System.out.println("Your number is odd!");
        } else if (x % 2 == 0) {
            System.out.println("Your number is even!");
        }
    }
}
