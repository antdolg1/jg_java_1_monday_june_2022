package main.java.students.student_robert_pavlov.homework.lesson_3.Level_4;

public class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {return this.ownerFirstName;}

    String getOwnerLastName() {return this.ownerFirstName;}

    int getMoneyAmount() {return this.moneyAmount;}

}
