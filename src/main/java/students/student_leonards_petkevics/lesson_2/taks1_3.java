package main.java.students.student_leonards_petkevics.lesson_2;

import java.util.Scanner;

public class taks1_3 {
    public static void main(String[] args){


        int firstnumber;
        int secondnumber;

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        firstnumber = input.nextInt();
        System.out.print("Enter the second number: ");
        secondnumber = input.nextInt();
        //Reduce amount+fee from balance
        secondnumber = firstnumber*(secondnumber );
        //Print new balance
        System.out.print("Answer is: "+secondnumber);
    }
}
