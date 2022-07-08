package main.java.students.student_Denis_Kaira.Lesson_2.Homework;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число которое хотите разделить");
        double a = in.nextDouble();
        System.out.println("Введите число");
        double b = in.nextDouble();
        System.out.println("Результат: " + a/b);

        System.out.println("Введите число которое хотите умножить");
        double c = in.nextDouble();
        System.out.println("Введите число");
        double d = in.nextDouble();
        System.out.println("Результат: " + c*d);

        System.out.println("Введите число которое хотите сложить");
        double f = in.nextDouble();
        System.out.println("Введите число");
        double g = in.nextDouble();
        System.out.println("Результат: " + (f+g));

        System.out.println("Введите число которое хотите вычесть");
        double h = in.nextDouble();
        System.out.println("Введите число");
        double j = in.nextDouble();
        System.out.println("Результат: " + (h-j));


    }
}
