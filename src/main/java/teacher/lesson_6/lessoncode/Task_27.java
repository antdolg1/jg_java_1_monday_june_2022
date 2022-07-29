package main.java.teacher.lesson_6.lessoncode;

import java.util.Random;

public class Task_27 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[random.nextInt(10)];

        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1000);
            System.out.println("[" + i + "] = " + array[i]);
            if (maxNumber < array[i]){
                maxNumber = array[i];
            }
        }

        System.out.println("Max number is: " + maxNumber);

    }
}
