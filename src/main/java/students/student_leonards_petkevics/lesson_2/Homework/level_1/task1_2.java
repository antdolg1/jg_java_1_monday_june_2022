package main.java.students.student_leonards_petkevics.lesson_2.Homework.level_1;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args){

        int thirdNumber;
        int fourthNumber;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the first number: ");

        thirdNumber = input.nextInt();

        System.out.print("Enter the second number: ");

        fourthNumber = input.nextInt();

        fourthNumber = thirdNumber+(fourthNumber );

        System.out.print("Answer is: "+ fourthNumber);
    }
}
