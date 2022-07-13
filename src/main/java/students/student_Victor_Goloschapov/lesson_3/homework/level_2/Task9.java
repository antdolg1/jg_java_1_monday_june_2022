package lesson_3.homework.level_2;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;

        System.out.print("Please enter your name: ");
        userName = input.nextLine();

        System.out.println("Hello: " + userName);
    }
}
