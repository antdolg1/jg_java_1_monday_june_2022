package main.java.students.student_alisa_sinavska._lesson_5.level_4;

import java.util.Random;

class task30 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
            System.out.println("[" + i + "] " + array[i]);
        }

        int oddNumber;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i];
            if (array[i] % 2 != 0) {
                oddNumber = array[i];
                System.out.println("Odd number are: " + array[i]);
            }
        }

    }

}

