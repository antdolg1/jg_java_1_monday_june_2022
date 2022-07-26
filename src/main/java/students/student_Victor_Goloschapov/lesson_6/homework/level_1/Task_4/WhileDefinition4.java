package lesson_6.homework.level_1.Task_4;

public class WhileDefinition4 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
/*Решение
1. Постфиксный инкремент перенес в блок цикла while. Без инкремента получится бесконечный цикл
*/