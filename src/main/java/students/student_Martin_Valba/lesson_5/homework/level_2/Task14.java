package main.java.students.student_Martin_Valba.lesson_5.homework.level_2;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt();

        int[] randoms = {randomNumber, randomNumber, randomNumber};

        System.out.println((randoms[0]) + (randoms[1]) + (randoms[2]) / 3);
    }
}
