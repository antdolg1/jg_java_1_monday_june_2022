package main.java.students.student_alisa_sinavska.lesson_4.homework.level_6;

public class StockTest {


    public static void main(String[] args) {

StockTest stockTest = new StockTest();
stockTest.test1();
stockTest.test2();


    }

    public void test1(){
        int newPrice = 10;
        String expectedResult = "Company = " + "GOOG" + ", Current Price = " + 10 + ", Min Price = " + 10 + ", Max Price = " + 10;
        Stock stock = new Stock("GOOG", 10);
        String realResult = stock.getPriceInformation();
        if (realResult.equals(expectedResult)) {
            System.out.println("Test1 test = OK");
        } else {
            System.out.println("Test1 test = FAIL");
        }
    }
    public void test2(){
        int newPrice = 12;
        String expectedResult = "Company = " + "GOOG" + ", Current Price = " + 77 + ", Min Price = " + 5 + ", Max Price = " + 99;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        String realResult = stock.getPriceInformation();
        if (realResult.equals(expectedResult)) {
            System.out.println("Test2 test = OK");
        } else {
            System.out.println("Test2 test = FAIL");
        }
    }
    }
