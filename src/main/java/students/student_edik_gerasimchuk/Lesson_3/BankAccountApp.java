package main.java.students.student_Edik_Gerasimchuk.Lesson_3;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount customerOne = new BankAccount("Jhon");

        customerOne.moneyAmount = 100;

        customerOne.addMoney(500);

        System.out.println(customerOne.owner + " has " + customerOne.moneyAmount + " on his bank account.");

        customerOne.removeMoney(100);

        System.out.println(customerOne.owner + " has " + customerOne.moneyAmount + " on his bank account.");

    }
}
