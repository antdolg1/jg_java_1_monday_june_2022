package main.java.students.student_leonards_petkevics.lesson_2;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args){

        int thirdnumber;
        int fourthnumber;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the first number: ");

        thirdnumber = input.nextInt();

        System.out.print("Enter the second number: ");

        fourthnumber = input.nextInt();

        fourthnumber = thirdnumber+(fourthnumber );

        System.out.print("Answer is: "+fourthnumber);
    }
}
