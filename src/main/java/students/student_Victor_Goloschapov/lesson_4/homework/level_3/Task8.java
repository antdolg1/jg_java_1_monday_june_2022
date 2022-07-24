package lesson_4.homework.level_3;

import java.util.Scanner;

public class Task8 {
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

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else if ((number1 == number2) || (number1 == number3) || (number2 == number3)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
//Help :(
//не совсем понял условие "Neither all are equal or different - если одно из чисел не равно остальным?
//All numbers are different - покажет, если числа не равны. Я его записал в блоке else

