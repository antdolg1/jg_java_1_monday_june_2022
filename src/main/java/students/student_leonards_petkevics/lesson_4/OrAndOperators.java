package main.java.students.student_leonards_petkevics.lesson_4;

public class OrAndOperators {
    public static void main(String[] args) {

        int month = 10;
        if (month == 1 ||month == 2 || month == 3) {
            System.out.println("Winter");
    } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("SUMMER");
        }
        else if (month == 7 || month == 8 || month == 9) {
            System.out.println("SPRING");
        }
        else if (month == 10 || month == 11 || month == 12) {
            System.out.println("AUTUM");
        }
        else {
            System.out.println("Are you from this planet?");
        }


        int numeber = 10;

        if (numeber > 5 && (numeber > 20 || numeber < 23)){
            System.out.println("Number is between 5 and 20");
        }
        else if (numeber != 10){
            System.out.println("Number is 10");
        }
        else if (numeber > 0 && numeber == 10) {
            System.out.println("Number is bigger than zero and is equal to 10");
        }
        else {
            System.out.println("I don't know such a number");
        }

    }
    }
