package main.java.students.student_leonards_petkevics.lesson_3;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {

        BankAccount customerOne = new BankAccount("John");


        System.out.println(customerOne.owner + " has " + customerOne.moneyAmount + " on his account.");

        customerOne.addMoney(500);

        System.out.println(customerOne.owner + " has " + customerOne.moneyAmount + " on his account.");

        customerOne.removeMoney(100);

        System.out.println(customerOne.owner + " has " + customerOne.moneyAmount + " on his account.");

    }
}
