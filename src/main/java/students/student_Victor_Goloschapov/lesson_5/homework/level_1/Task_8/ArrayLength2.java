package lesson_5.homework.level_1.Task_8;

public class ArrayLength2 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 4;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
    }
}
/*Решение
1. Добавил [] после int
2. Массив, длиной 2 элемента. Вызов третьего элемента numbers[2] лишний.
*/
