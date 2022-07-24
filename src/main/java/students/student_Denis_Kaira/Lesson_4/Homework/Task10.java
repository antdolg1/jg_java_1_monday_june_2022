package main.java.students.student_Denis_Kaira.Lesson_4.Homework;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int number = scanner.nextInt();
        System.out.println("Enter number 2 : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number 3 : ");
        int number3 = scanner.nextInt();

        if (number >= number2 && number >= number3){
            System.out.print("number is biggest ");
        } else if (number2 >= number && number2 >= number3) {
                System.out.print("number2 is biggest ");
        } else if (number3 >= number && number3 >= number2) {
            System.out.print("number3 is biggest ");
        }

    }
}