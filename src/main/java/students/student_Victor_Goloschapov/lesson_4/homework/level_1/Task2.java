package lesson_4.homework.level_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Введите число ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("Число " + number + " отрицательное");
        } else if (number == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.println("Число " + number + " положительное");
        }
    }
}
