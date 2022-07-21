package main.java.students.student_Edik_Gerasimchuk.Lesson_5.Level_2;

public class Task_14 {

    public static void main(String[] args) {

        int[] nums = new int[3];

        int c = nums[0] = 5;
        int v = nums[1] = 17;
        int b = nums[2] = 21;

        int sum = 0;

        int i = 0;
        while (i < nums.length) {
            sum += nums[i];
            i++;
        }

        int average = (sum / nums.length);

        System.out.println("Average : " + average);
    }

}

