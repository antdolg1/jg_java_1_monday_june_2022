package main.java.students.student_robert_pavlov.homework.lesson_5.Task_2;

import java.util.Scanner;

public class Task_12 {

    public static void main(String[] args) {

        int [] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        numbers[0] = (int) (Math.random() * (10-5)) + 5;
        numbers[1] = (int) (Math.random() * (10-6)) + 5;
        numbers[2] = (int) (Math.random() * (10-7)) + 5;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }

}
