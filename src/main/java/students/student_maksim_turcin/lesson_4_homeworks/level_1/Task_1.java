package main.java.students.student_maksim_turcin.lesson_4_homeworks.level_1;


import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("Number is positive!");
        } else  {
            System.out.println("Number is negative!");
        }
    }
}
