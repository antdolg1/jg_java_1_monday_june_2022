package main.java.students.student_Martin_Valba.lesson_5.homework.level_2;

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt();

        int[] number = new int[3];

        int firstRandom = randomNumber;
        int secondRandom = randomNumber;
        int thirdRandom = randomNumber;

        number[0] = firstRandom;
        number[1] = secondRandom;
        number[2] = thirdRandom;

        System.out.println(firstRandom);
        System.out.println(secondRandom);
        System.out.println(thirdRandom);
    }
}
