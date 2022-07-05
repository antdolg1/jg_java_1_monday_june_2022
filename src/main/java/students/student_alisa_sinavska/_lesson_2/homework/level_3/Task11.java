package main.java.students.student_alisa_sinavska._lesson_2.homework.level_3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Write second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Write third number: ");
        double thirdNumber = scanner.nextDouble();

        System.out.println("Arithmetical average: " + ((firstNumber + secondNumber + thirdNumber)/3));
}
}
