package lesson_5.homework.level_2;

public class Task13 {
    public static void main(String[] args) {
        int[] randomNumberArray = new int[3];
        int rangeTill100 = 100;
        int sumResult = 0;

        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (Math.random() * rangeTill100);
            sumResult += randomNumberArray[i];
        }
        System.out.println("Результат сложения чисел в массиве: " + sumResult);
    }
}
