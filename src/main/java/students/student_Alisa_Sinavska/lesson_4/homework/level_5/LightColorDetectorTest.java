package main.java.students.student_alisa_sinavska.lesson_4.homework.level_5;

import main.java.students.student_alisa_sinavska.lesson_4.homework.level_4.Calculator;
import main.java.students.student_alisa_sinavska.lesson_4.homework.level_4.CalculatorTest;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lcdTest();
        lightColorDetectorTest.lcdTest2();
        lightColorDetectorTest.lcdTest3();
        lightColorDetectorTest.lcdTest4();
        lightColorDetectorTest.lcdTest5();
        lightColorDetectorTest.lcdTest6();
        lightColorDetectorTest.lcdTest7();


    }

    public void lcdTest() {
        int wavelength = 10;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("LCD test = OK");
        } else {
            System.out.println("LCD test = FAIL");
        }
    }

    public void lcdTest2() {
        int wavelength = 400;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("LCD2 test = OK");
        } else {
            System.out.println("LCD2 test = FAIL");
        }
    }

    public void lcdTest3() {
        int wavelength = 470;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("LCD3 test = OK");
        } else {
            System.out.println("LCD3 test = FAIL");
        }
    }

    public void lcdTest4() {
        int wavelength = 500;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("LCD4 test = OK");
        } else {
            System.out.println("LCD4 test = FAIL");
        }
    }
    public void lcdTest5() {
        int wavelength = 580;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("LCD5 test = OK");
        } else {
            System.out.println("LCD5 test = FAIL");
        }
    }
    public void lcdTest6() {
        int wavelength = 600;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("LCD6 test = OK");
        } else {
            System.out.println("LCD6 test = FAIL");
        }
    }
    public void lcdTest7() {
        int wavelength = 700;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("LCD7 test = OK");
        } else {
            System.out.println("LCD7 test = FAIL");
        }
    }

}
