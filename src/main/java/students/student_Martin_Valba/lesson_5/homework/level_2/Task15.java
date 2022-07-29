package main.java.students.student_Martin_Valba.lesson_5.homework.level_2;

public class Task15 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = (int) (Math.random() * (1 - 2)) + 3;
        numbers[1] = (int) (Math.random() * (4 - 5)) + 6;
        numbers[2] = (int) (Math.random() * (7 - 8)) + 9;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        numbers[0] += 2;
        numbers[1] += 2;
        numbers[2] += 2;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
