package main.java.students.student_Alisa_Sinavska.lesson_3.level_2.level_7;

public class BankAccount {
    String owner;
    int money;

    BankAccount(final String owner, final int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}
