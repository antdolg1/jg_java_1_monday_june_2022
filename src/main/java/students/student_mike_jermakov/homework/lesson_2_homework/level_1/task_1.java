import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, write the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("And now, write the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum result: " + (firstNumber + secondNumber));

        System.out.println("Dif result: " + (firstNumber - secondNumber));

        System.out.println("Mult result: " + (firstNumber * secondNumber));

        System.out.println("Div result: " + (firstNumber / secondNumber));
    }
}