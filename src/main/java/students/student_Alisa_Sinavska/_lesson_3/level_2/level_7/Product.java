package main.java.students.student_alisa_sinavska._lesson_3.level_2.level_7;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(double regularPrice, double discount) {
        this.name = "cucumber";
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    void printInformation() {
        System.out.println(name + " actual price is: " + actualPrice());

    }
    double actualPrice() {
        return (regularPrice - discount);
    }
}
