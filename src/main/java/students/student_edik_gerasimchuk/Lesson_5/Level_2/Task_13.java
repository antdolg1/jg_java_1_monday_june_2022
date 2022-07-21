package main.java.students.student_Edik_Gerasimchuk.Lesson_5.Level_2;

public class Task_13 {

    public static void main(String[] args) {


        int nums[] = new int[3];

        int e = nums[0] = 4;
        int b = nums[1] = 37;
        int c = nums[2] = 61;

        System.out.println("Sum of all numbers is : " + (e+b+c));

        for (int a = 0; a < nums.length; a++) {
            System.out.println("[" + a + "] " + nums[a]);

            //Не уверен что это так делаеться.
            //Если поставить строку с суммой под методом For то программа продублирует это сообщение 3 раза!
            //Вопрос почему?

        }
    }
}
