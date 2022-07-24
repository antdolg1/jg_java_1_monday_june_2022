package lesson_5.homework.level_2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numberList = new int[3];
        System.out.println("Введите целое число:");

        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = input.nextInt();
        }
        for (int j = 0; j < numberList.length; j++) {
            System.out.println("Результат вывода на консоль: " + numberList[j]);
        }
    }
}
