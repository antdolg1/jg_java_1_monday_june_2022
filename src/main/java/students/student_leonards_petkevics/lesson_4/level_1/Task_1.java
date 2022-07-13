package main.java.students.student_leonards_petkevics.lesson_4.levle_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number: ");
        x = input.nextInt();

        if (x > 0){
            System.out.println("Your number is positive!");
        }

        else if (x < 0){
            System.out.println("Your number is negative!");
        }


    }
}
