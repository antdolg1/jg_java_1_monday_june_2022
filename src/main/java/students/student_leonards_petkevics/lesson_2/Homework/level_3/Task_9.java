package main.java.students.student_leonards_petkevics.lesson_2.Homework.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main (String[] args){

        int numberOne;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        numberOne = input.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", numberOne, i, numberOne * i);
        }
    }
}
