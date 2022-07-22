package lesson_5.homework.level_2;

public class Task12 {
    public static void main(String[] args) {
        int[] randomNumberArray = new int[3];

        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) Math.rint(Math.random() * 100);
            System.out.println("Результат вывода на консоль: " + randomNumberArray[i]);
        }
    }
}
