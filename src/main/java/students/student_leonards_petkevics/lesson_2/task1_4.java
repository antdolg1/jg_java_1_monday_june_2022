package main.java.students.student_leonards_petkevics.lesson_2;

import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args){

        int firstnumber;
        int secondnumber;

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        firstnumber = input.nextInt();
        System.out.print("Enter the second number: ");
        secondnumber = input.nextInt();

        secondnumber = firstnumber/(secondnumber );

        System.out.print("Answer is: "+secondnumber);
    }
}
