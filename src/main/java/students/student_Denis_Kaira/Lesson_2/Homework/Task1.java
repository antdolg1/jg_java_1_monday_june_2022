package main.java.students.student_Denis_Kaira.Lesson_2.Homework;

import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число которое хотите вычесть");
        int a = in.nextInt();
        System.out.println("Введите число");
        int b = in.nextInt();
        System.out.println("Результат = "+ (a-b));

        System.out.println("Введите число которое хотите сложить");
        int c = in.nextInt();
        System.out.println("Введите число");
        int d = in.nextInt();
        System.out.println("Результат = "+ (c+d));

        System.out.println("Введите число которое хотите разделить");
        int f = in.nextInt();
        System.out.println("Введите число");
        int g = in.nextInt();
        System.out.println("Результат = "+ f/g);

        System.out.println("Введите число которое хотите  умножить");
        int m = in.nextInt();
        System.out.println("Введите число");
        int n = in.nextInt();
        System.out.println("Результат = "+ m*n);


    }

}
