package main.java.students.student_maksim_turcin.lesson_5_homeworks.level_2;

public class Task_15 {

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000); // случайное число до 1000
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println("array[i] + 2 = " + (2 + array[i])) ;
        }
    }
}


