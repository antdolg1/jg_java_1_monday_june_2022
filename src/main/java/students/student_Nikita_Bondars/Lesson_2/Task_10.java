package main.java.students.student_Nikita_Bondars.Lesson_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Radius:");
        double radius = scanner.nextDouble();

        double perimeter = radius * 2 * 3.1415;
        System.out.println("Perimeter is = " + perimeter);

        double area = radius * radius * 3.1415;
        System.out.println("Area is = " + area);
    }
}
