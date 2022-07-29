package main.java.students.student_Alisa_Sinavska.lesson_3.level_2.level_7;

public class BankAccountDemo {
    public static void main(final String[] args) {
        final BankAccount bankAccount = new BankAccount("Viktor", 100000);
        final String ownerFirstName = bankAccount.getOwner();
        final int moneyAmount = bankAccount.getMoney(); // мне пришлось здесь поменять String на int, как иначе??????
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
