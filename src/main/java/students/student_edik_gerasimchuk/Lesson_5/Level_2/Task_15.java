package main.java.students.student_Edik_Gerasimchuk.Lesson_5.Level_2;

public class Task_15 {

    public static void main(String[] args) {


        int nums[] = new int[3];

        int c = nums[0] = 4;
        int g = nums[1] = 37;
        int b = nums[2] = 61;

        for (int a = 0; a < nums.length; a++) {
            System.out.println("[" + a + "] " + nums[a]);
        }
System.out.println("Plus 2: ");
        c++;
        c++;
        System.out.println("[0] " + c);

        g++;
        g++;
        System.out.println("[1] " + g);

        b++;
        b++;
        System.out.println("[2] " + b);
    }
}
