package main.java.students.student_Victor_Goloschapov;

public class variables {
    public static void main (final String[] args) { //main function
        final int x = 10;
        final int y = 20;
        final var z = 25; // no need to add data type
        //const
        final int NUM = 30; //using name final for const. const name in uppercase
        System.out.println("Var X contains: " + x);
        System.out.println("Var Y contains: " + y);
        System.out.println("Var z contains: " + z);
        System.out.println("Const NUM contains: " + NUM);
    }
}
