package lesson_6.homework.level_1.Task_6;

public class NumberUtilsDemo {
    public static void main(String[] args) {
        NumberUtils checkIsNumberEven = new NumberUtils();

        boolean isEven = checkIsNumberEven.isEven(2);
        System.out.println("Is number is even?: " + isEven);

        boolean isEven2 = checkIsNumberEven.isEven(3);
        System.out.println("Is number is even?: " + isEven2);
    }
}
