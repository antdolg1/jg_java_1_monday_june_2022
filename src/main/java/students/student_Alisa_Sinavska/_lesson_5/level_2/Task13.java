package main.java.students.student_alisa_sinavska._lesson_5.level_2;

import java.util.Scanner;

class Task13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        numbers[0] = (int) (Math.random() * (200 + 1)) - 100;
        numbers[1] = (int) (Math.random() * (200 + 1)) - 100;
        numbers[2] = (int) (Math.random() * (200 + 1)) - 100;
        System.out.println((numbers[0]) + (numbers[1]) + (numbers[2]));


    }

}
