package main.java.students.student_leonards_petkevics.lesson_2.Homework.level_1;

import java.util.Scanner;

 class task2_4 {
    public static void main(String[] args){

        double firstNumber;
        double secondNumber;

        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the first number: ");
        firstNumber = input.nextDouble();
        System.out.print("Enter the second number: ");
        secondNumber = input.nextDouble();

        secondNumber = firstNumber * (secondNumber);
        System.out.print("Answer is: "+ secondNumber);

    }
}
