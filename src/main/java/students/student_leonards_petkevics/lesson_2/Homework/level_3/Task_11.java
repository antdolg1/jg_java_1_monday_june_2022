package main.java.students.student_leonards_petkevics.lesson_2.Homework.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){

        double firstNumber;
        double secondNumber;
        double thirdnumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        firstNumber = input.nextDouble();
        System.out.print("Enter second number : ");
        secondNumber = input.nextDouble();
        System.out.print("Enter third number : ");
        thirdnumber = input.nextDouble();

        System.out.print("The answer : " + (firstNumber + secondNumber + thirdnumber) / 3);


    }
}
