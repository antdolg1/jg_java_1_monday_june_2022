package main.java.students.student_alisa_sinavska.lesson_4.homework.level_6;

public class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (minPrice > newPrice) {
            minPrice = newPrice;
        }
        if (maxPrice < newPrice) {
            maxPrice = newPrice;
        }
    }

    String getPriceInformation() {
        return "Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }
}


