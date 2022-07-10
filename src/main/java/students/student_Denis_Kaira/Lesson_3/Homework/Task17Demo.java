package main.java.students.student_Denis_Kaira.Lesson_3.Homework;

public class Task17Demo {


    public static void main(String[] args) {
        Task17 bankAccount = new Task17("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName= bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }
        
}

