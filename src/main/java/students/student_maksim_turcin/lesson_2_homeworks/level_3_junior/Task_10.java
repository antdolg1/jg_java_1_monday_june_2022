package main.java.students.student_maksim_turcin.lesson_2_homeworks.level_3_junior;

import java.util.Scanner;

public class Task_10 {

        public static void main(String[] args) {

            Scanner scnRadius = new Scanner(System.in);

            System.out.println("Enter Radius: ");

            double radius = scnRadius.nextDouble();

            double perimeter = radius * 2 * 3.1415;

            System.out.println("Perimeter is = " + perimeter);

            double area = radius * radius  * 3.1415;

            System.out.println("Area is = " + area);

    }
}
