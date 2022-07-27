package main.java.students.student_alisa_sinavska._lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write array length: ");
        int aLength = scanner.nextInt();
        int[] arrayLength = new int[aLength];

        Random random = new Random();
        for (int i = 0; i < arrayLength.length; i++) {
            arrayLength[i] = random.nextInt(1000);
            System.out.println("[" + i + "] " + arrayLength[i]);
        }
    }
}
