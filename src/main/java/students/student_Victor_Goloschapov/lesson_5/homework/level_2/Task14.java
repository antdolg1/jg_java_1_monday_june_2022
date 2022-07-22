package lesson_5.homework.level_2;

public class Task14 {
    public static void main(String[] args) {
        int[] numberArray = new int[3];
        int rangeTill100 = 100;
        int sumResult = 0;
        double arrayLength = numberArray.length;
        double avgNumberResult;

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] =  (int) (Math.random() * rangeTill100);
            sumResult += numberArray[i];
        }
        System.out.println("Сумма всех элементов массива: " + sumResult);
        avgNumberResult = sumResult / arrayLength;
        System.out.println("среднее значение всех элементов массива: " + avgNumberResult);
    }
}
//Случайные числа от 0 до 100
//в массиве только целые числа как по условию
//среднее значение может быть дробным ==> использовал тип данных double для переменной со средним значением