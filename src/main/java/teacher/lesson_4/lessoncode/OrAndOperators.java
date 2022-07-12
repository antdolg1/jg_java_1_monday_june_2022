package main.java.teacher.lesson_4.lessoncode;

public class OrAndOperators {

    public static void main(String[] args) {

        int month = 3;

        if (month == 1 || month == 2 || month == 3) {
            System.out.println("WINTER");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("SUMMER");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("AUTUMN");
        } else if (month == 10 || month == 11 || month == 12) {
            System.out.println("SPRING");
        } else {
            System.out.println("Are you from earth?");
        }

        System.out.println("_____________________");


        int number = 10;

        if (number > 5 && (number > 20 || number < 23)) {
            System.out.println("Number is between 5 and 20");
        } else if (number != 10) {
            System.out.println("Number is 10");
        } else if (number > 0 && number == 10) {
            System.out.println("Number is bigger than zero and is equals to 10");
        } else {
            System.out.println("I don't know such a number");
        }

    }

}
