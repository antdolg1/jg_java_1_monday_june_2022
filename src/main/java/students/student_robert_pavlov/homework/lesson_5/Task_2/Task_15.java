package main.java.students.student_robert_pavlov.homework.lesson_5.Task_2;

import java.util.Scanner;

public class Task_15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        numbers[0] = (int) (Math.random() * (10-5)) + 5;
        numbers[1] = (int) (Math.random() * (10-6)) + 5;
        numbers[2] = (int) (Math.random() * (10-7)) + 5;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println( numbers[2]);

        numbers[0] = numbers[0]++;
        numbers[1] = numbers[1]++;
        numbers[2] = numbers[2]++;

        System.out.println(" First number is: " + numbers[0]);
        System.out.println(" Second number is: " + numbers[1]);
        System.out.println(" Thirds number is: " + numbers[2]);

    }


}
