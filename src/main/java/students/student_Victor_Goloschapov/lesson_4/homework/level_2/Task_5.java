package lesson_4.homework.level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Введите целое число 1: ");
        number1 = input.nextInt();

        System.out.print("Введите целое число 2: ");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.print("Ответ: " + number1);
        } else if (number2 > number1) {
            System.out.print("Ответ: " + number2);
        }
    }
}