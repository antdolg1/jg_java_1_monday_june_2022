package main.java.teacher.lesson_5.lessoncode;

public class ArraysUtils {

    static int sumOfArrayNumbers(int[] array) {

        int sumNumbers = 0;

        for (int element : array) {
            sumNumbers += element;
        }

        return sumNumbers;
    }

    static void printArray(String[] array) {

        for (String element : array) {
            System.out.print(element + " ");
        }

    }
}
