package main.java.teacher.lesson_6.lessoncode;

public class Task_26_Example {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        int arrLength = arrayUtils.getArrayLengthFromUser();
        int[] arr = arrayUtils.createArray(arrLength);
        arrayUtils.fillArrayWithRandomNumbers(arr);
        arrayUtils.printArrayToConsole(arr);
    }
}
