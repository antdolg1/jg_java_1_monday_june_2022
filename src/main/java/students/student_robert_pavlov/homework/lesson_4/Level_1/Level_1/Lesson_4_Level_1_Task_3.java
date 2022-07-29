package main.java.students.student_robert_pavlov.homework.lesson_4.Level_1.Level_1;

import java.util.Scanner;

public class Lesson_4_Level_1_Task_3 {
    public static void main(String[] args) {

        int day;
        System.out.println(" enter the number ");

        Scanner input = new Scanner(System.in);
        day = input.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("ERROR");
        }

    }
}
