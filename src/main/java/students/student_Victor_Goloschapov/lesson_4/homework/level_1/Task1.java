package lesson_4.homework.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Введите число ");

        if (input.hasNextInt()) {
            number = input.nextInt();
            if (number < 0) {
                System.out.println("Число " + number + " отрицательное");
            } else {
                System.out.println("Число " + number + " положительное");
            }
        } else {
            System.out.println("Извините, но это явно не число. Введите число");
        }
    }
}
//Решил добавить проверку на правильность ввода данных