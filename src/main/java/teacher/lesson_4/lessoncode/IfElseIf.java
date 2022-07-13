package main.java.teacher.lesson_4.lessoncode;

public class IfElseIf {

    public static void main(String[] args) {

        String catName = "Boris";

        if (catName.equals("Lui")) {
            System.out.println("Your cat name is Lui");
        } else if (catName.equals("John")) {
            System.out.println("Your cat name is not John");
        } else if (catName.equals("Dora")) {
            System.out.println("Your cat name is not Dora");
        } else {
            System.out.println("You don't have a cat!");
        }

        int x = 10;

        if (!(x > 2)){
            System.out.println("x > 2");
        } else {
            System.out.println("x < 2");
        }

        String creditCard = "VISA";

        if (creditCard.equals("MASTERCARD") || creditCard.equals("MAXIMA") || creditCard.equals("ROYAL")) {
            //do something
        }

        if (!(creditCard.equals("VISA"))){
            //do something
        }

    }
}
