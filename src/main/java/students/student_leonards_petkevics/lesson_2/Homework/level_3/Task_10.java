package main.java.students.student_leonards_petkevics.lesson_2.Homework.level_3;

import java.util.Scanner;

 class Task_10 {
    public static void main (String[] args){

         Scanner sc = new Scanner(System.in);
         System.out.print("Radius : ");

        double radius = sc.nextDouble();

        double area = Math.PI * (radius * radius);
        System.out.println("Perimetr : " + area);

        double circumference= Math.PI * 2*radius;
        System.out.println("Area : " + circumference);
    }
}
