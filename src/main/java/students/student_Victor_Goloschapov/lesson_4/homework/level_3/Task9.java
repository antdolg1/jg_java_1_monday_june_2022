package lesson_4.homework.level_3;

import java.util.Scanner;

public class Task9 {
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

        if (number1 < number2 && number2 < number3) {
            System.out.println("Increasing order");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
