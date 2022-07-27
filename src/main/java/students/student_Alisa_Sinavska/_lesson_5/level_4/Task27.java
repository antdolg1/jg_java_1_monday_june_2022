package main.java.students.student_alisa_sinavska._lesson_5.level_4;

import java.util.Random;

class Task27 {
    public static void main(String[] args){

        Random random = new Random();
        int[] array = new int[10];

        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
            System.out.println( "[" + i + "] " + array[i]);
            if  (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("Max number is: " + maxNumber);


    }
}
