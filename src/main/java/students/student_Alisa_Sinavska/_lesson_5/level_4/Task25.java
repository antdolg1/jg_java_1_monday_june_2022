package main.java.students.student_alisa_sinavska._lesson_5.level_4;

import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write array length: ");
        int aLength = scanner.nextInt();
        int[] arrayLength = new int[aLength];

        for (int i = 0; i < arrayLength.length; i++) {
            System.out.println("Input number: ");
            arrayLength[i] = scanner.nextInt();
            System.out.println("[" + i + "] " + arrayLength[i]);
        }
    }
}
