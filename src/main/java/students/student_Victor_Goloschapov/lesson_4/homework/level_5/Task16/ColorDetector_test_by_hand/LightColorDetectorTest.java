package lesson_4.homework.level_5.Task16.ColorDetector_test_by_hand;

import java.util.Scanner;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lightWaveLength;
        String result;

        System.out.println("Welcome to color detector application");
        System.out.println("Application will detect color depending on light wave length");
        System.out.println("======================================\n");
        System.out.print("Please enter light wave length: ");
        lightWaveLength = input.nextInt();

        LightColorDetector colorDetector = new LightColorDetector();
        result = colorDetector.detect(lightWaveLength);
        System.out.println("Expected result: " + result);

    }
}
