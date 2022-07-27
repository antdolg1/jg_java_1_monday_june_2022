package main.java.students.student_alisa_sinavska._lesson_5.level_4;

import java.util.Random;

class Task28 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[9];

        int minNumber = 10000;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
            System.out.println("[" + i + "] " + array[i]);
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.println("Min number is: " + minNumber);
    }
}

