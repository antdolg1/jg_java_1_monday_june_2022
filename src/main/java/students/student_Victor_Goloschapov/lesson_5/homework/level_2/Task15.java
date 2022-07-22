package lesson_5.homework.level_2;

public class Task15 {
    public static void main(String[] args) {
        int[] randomNumberArray = new int[3];
        int rangeTill100 = 100;
        int result;
        int increment = 2;

        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (Math.random() * rangeTill100);
            System.out.println("Элемент в массиве: " + randomNumberArray[i]);
        }

        for (int j = 0; j < randomNumberArray.length; j++) {
            result = randomNumberArray[j] + increment;
            System.out.println("Результат увеличения элемента на 2: " + result);
        }
    }
}
