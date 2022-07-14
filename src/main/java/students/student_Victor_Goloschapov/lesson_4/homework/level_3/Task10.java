package lesson_4.homework.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        System.out.print("Введите целое число 1: ");
        number1 = input.nextInt();

        System.out.print("Введите целое число 2: ");
        number2 = input.nextInt();

        System.out.print("Введите целое число 3: ");
        number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.print("Ответ число 1: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.print("Ответ число 2: " + number2);
        } else if (number3 > number2 && number3 > number1) {
            System.out.print("Ответ число 3: " + number3);
        }
    }
}
