package main.java.teacher.lesson_3.lessoncode;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount customerOne = new BankAccount("John");

        System.out.println(customerOne.owner + " " + customerOne.moneyAmount + " on his bank account.");

        customerOne.addMoney(500);

        System.out.println(customerOne.owner + " " + customerOne.moneyAmount + " on his bank account.");

        customerOne.removeMoney(100);

        System.out.println(customerOne.owner + " " + customerOne.moneyAmount + " on his bank account.");
        
    }
}

