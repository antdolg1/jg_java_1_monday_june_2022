package main.java.students.student_robert_pavlov.homework.lesson_4.Level_1.Level_1;

import java.util.Scanner;

public class Lesson_4_Level_1_Task_4 {
    public static void main(String[] args) {

        int number;
             System.out.println(" enter the number ");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number % 2 == 0){
             System.out.println(" even number ");}

         else {
             System.out.println(" the number is not even ");}

    }
}
