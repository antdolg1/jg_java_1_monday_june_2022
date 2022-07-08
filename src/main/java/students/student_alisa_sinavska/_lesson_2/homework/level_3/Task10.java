package main.java.students.student_alisa_sinavska._lesson_2.homework.level_3;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write radius: ");
        double radius = scanner.nextDouble();

        System.out.println("Perimetr is: " + (radius * 2 * Math.PI) );
        System.out.println("Area is: " + (radius * radius * Math.PI));
    }
}
