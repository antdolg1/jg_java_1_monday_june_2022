import java.util.Scanner;

public class task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, write the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("And now write the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Sum result: " + (firstNumber+secondNumber));

        System.out.println("Dif result: " + (firstNumber-secondNumber));

        System.out.println("Mult result: " + (firstNumber*secondNumber));

        System.out.println("Div result: " + (firstNumber/secondNumber));

    }
}