package main.java.students.student_maksim_turcin.lesson_4_homeworks.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a first number :");
        int number1 = scanner.nextInt();
        System.out.println("Give me a second number :");
        int number2 = scanner.nextInt();
        System.out.println("Give me a third number :");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Larger number " + number1);
        } else if (number1 < number2 && number2 < number3) {
            System.out.println("Larger number " + number3);
        } else {
            System.out.println("Larger number " + number2); //made without a piece of paper(Task_10.txt)
        }
    }
}
