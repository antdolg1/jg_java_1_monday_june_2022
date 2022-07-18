package main.java.teacher.lesson_5.lessoncode;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        int value = 0;
        Scanner scanner = new Scanner(System.in);

        while (value < 5) {
            System.out.println("Hello!");
            System.out.println("Value = " + value + "\n");
            value = value + 1; //value++;
        }

        //----------------------------------------------

        for (int i = 0; i < 5; i++) {
//            System.out.printf("The value of i is %d and today is %d of June\n", i, 18);
            System.out.println("The value of i is " + i);
        }

        //----------------------------------------------

        do {
            System.out.println("Please enter a number:");
            value = scanner.nextInt();
        }
        while (value != 5);

        System.out.println("Got 5!");

        //----------------------------------------------

        int i = 1;

        if (i < 100) {
            i = i + 1; //i = 2
            System.out.println("i = " + i);
        }

        if (i < 100) {
            System.out.println("i = " + i);
            i = i + 1; //i = 3
        }

        if (i < 100) {
            System.out.println("i = " + i);
            i++; //i = 4
        }

        i++; //i = 5
        i = i + 1; // i = 6

        if (i < 100) {
            System.out.println("i = " + i);
            i++;
            System.out.println("i = " + i);
        }

        System.out.println("i = " + i);

        //----------------------------------------------

        for (int j = 0; j <= 100; j++) {
            System.out.println("Number j value is: " + j);
        }

        //----------------------------------------------

        for (int k = 100; k >= 0; k--) {
            System.out.println("Number k value is: " + k);
        }
    }
}
