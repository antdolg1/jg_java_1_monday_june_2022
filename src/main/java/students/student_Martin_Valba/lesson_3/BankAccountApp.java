package main.java.students.student_Martin_Valba.lesson_3;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount customerOne = new BankAccount ("John");

        System.out.println("John has " + customerOne.moneyAmount + " on his bank account.");

        customerOne.addMoney(500);

        System.out.println("John has " + customerOne.moneyAmount + " on his bank account.");

        customerOne.removeMoney(100);

        System.out.println("John has " + customerOne.moneyAmount + " on his bank account.");

    }
}
