package main.java.teacher.lesson_6.lessoncode;

public class Task_25_Example {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        int arrLength = arrayUtils.getArrayLengthFromUser();
        int[] arr = arrayUtils.createArray(arrLength);
        arrayUtils.fillArrayWithNumbersFromUser(arr);
        arrayUtils.printArrayToConsole(arr);
    }
}
