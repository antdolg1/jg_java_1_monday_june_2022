package main.java.students.student_leonards_petkevics.lesson_2.Homework.level_1;

import java.util.Scanner;

class task1 {
    public static void main(String[] args){

        int firstNumber;
        int secondNumber;

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = input.nextInt();

        secondNumber = firstNumber - (secondNumber );

        System.out.println("Answer is: "+ secondNumber);

    }
}
