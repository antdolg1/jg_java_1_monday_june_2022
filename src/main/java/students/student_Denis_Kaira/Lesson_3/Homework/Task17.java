package main.java.students.student_Denis_Kaira.Lesson_3.Homework;

public class Task17 {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    Task17 (String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerLastName;
    }

    int getMoneyAmount() {
        return this.moneyAmount;
    }
}
