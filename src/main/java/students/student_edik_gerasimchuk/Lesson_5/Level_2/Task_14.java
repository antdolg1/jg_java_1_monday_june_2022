package main.java.students.student_Edik_Gerasimchuk.Lesson_5.Level_2;

public class Task_14 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};

        float sum = 0;

        int i=0;
        while(i < nums.length) {
            sum += nums[i];
            i++;
        }

        float average = (sum / nums.length);

        System.out.println("Average : "+average);
    }
}

