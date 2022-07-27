package main.java.students.student_alisa_sinavska._lesson_5.level_2;

import java.util.Scanner;

class Task15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        numbers[0] = (int) (Math.random() * (200 + 1)) - 100;
        numbers[1] = (int) (Math.random() * (200 + 1)) - 100;
        numbers[2] = (int) (Math.random() * (200 + 1)) - 100;
        System.out.println("First number is: " + numbers[0]);
        System.out.println("Second number is: " + numbers[1]);
        System.out.println("Third number is: " + numbers[2]);

        numbers[0] = numbers[0] + 2;
        numbers[1] = numbers[1] + 2;
        numbers[2] = numbers[2] + 2;

        System.out.println("First number is: " + numbers[0]);
        System.out.println("Second number is: " + numbers[1]);
        System.out.println("Third number is: " + numbers[2]);
    }

}