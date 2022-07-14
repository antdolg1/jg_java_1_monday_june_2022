package lesson_4.homework.level_5.Task16;

import java.util.Scanner;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lightWaveLength;

        System.out.print("Please enter light wave length: ");

        lightWaveLength = input.nextInt();

        LightColorDetectorTest colorTest = new LightColorDetectorTest();
        colorTest.getVioletColor(lightWaveLength);
        colorTest.getBlueColor(lightWaveLength);
        colorTest.getGreenColor(lightWaveLength);
        colorTest.getYellowColor(lightWaveLength);
        colorTest.getOrangeColor(lightWaveLength);
        colorTest.getRedColor(lightWaveLength);
    }

    void getVioletColor(int waveLength) {
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = color.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("***Test passed. Expected color: " + expectedResult + "***");
            System.out.println("======================================");
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
            System.out.println("======================================");
        }
    }

    void getBlueColor(int waveLength) {
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = color.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("***Test passed. Expected color: " + expectedResult + "***");
            System.out.println("======================================");
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
            System.out.println("======================================");
        }
    }

    void getGreenColor(int waveLength) {
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = color.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("***Test passed. Expected color: " + expectedResult + "***");
            System.out.println("======================================");
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
            System.out.println("======================================");
        }
    }

    void getYellowColor(int waveLength) {
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = color.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("***Test passed. Expected color: " + expectedResult + "***");
            System.out.println("======================================");
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
            System.out.println("======================================");
        }
    }

    void getOrangeColor(int waveLength) {
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = color.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("***Test passed. Expected color: " + expectedResult + "***");
            System.out.println("======================================");
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
            System.out.println("======================================");
        }
    }

    void getRedColor(int waveLength) {
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = color.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("***Test passed. Expected color: " + expectedResult + "***");
            System.out.println("======================================");
        } else {
            System.out.println("Test failed");
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected result: " + expectedResult);
            System.out.println("======================================");
        }
    }
}
