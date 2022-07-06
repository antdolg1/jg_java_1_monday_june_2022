package main.java.students.student_leonards_petkevics.lesson_3;

public class BankAccount {

    String owner;
    int moneyAmount;
    String country;

    public BankAccount(String owner) {
        this.owner = owner;
        this.moneyAmount = 0;
        this.country = "Latvia";
    }

    int addMoney(int moneyToAdd) {
        moneyAmount = moneyAmount + moneyToAdd;
        return moneyAmount;
    }

    int removeMoney(int moneyToRemove){
        moneyAmount = moneyAmount - moneyToRemove;
        return moneyAmount;
    }


}
