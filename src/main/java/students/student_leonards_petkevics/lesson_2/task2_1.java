package main.java.students.student_leonards_petkevics.lesson_2;

import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args){


        double firstnumber;
        double secondnumber;

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        firstnumber = input.nextDouble();
        System.out.print("Enter the second number: ");
        secondnumber = input.nextDouble();

        secondnumber = firstnumber+(secondnumber );

        System.out.print("Answer is: "+secondnumber);


}
