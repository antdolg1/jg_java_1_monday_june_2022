package main.java.students.student_Denis_Kaira.Lesson_2.Homework;

import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Input the radius of the circle: ");
        double radius = io.nextDouble();
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }
}
