package main.java.students.student_Alisa_Sinavska.lesson_3.level_2.level_7;

public class Product {
    String name;
    double regularPrice;
    int discount;

    public void setRegularPrice(final double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(final int discount) {
        this.discount = discount;
    }

    public Product(final String name) {
        this.name = name;
    }

    public Product(final double regularPrice, final int discount) {
        this.name = "cucumber";
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    void printInformation() {
        System.out.println(name + " actual price is: " + calculateActualPrice(regularPrice, discount));

    }

    double calculateActualPrice(final Double regularPrice, final int discount) {

        return regularPrice - ((regularPrice * discount) / 100);
    }
}
