package main.java.students.student_Alisa_Sinavska.lesson_3.level_2.level_7;

public class ProductDemo {
    public static void main(final String[] args) {

        final Product product = new Product(100.00, 5);

        final Product newProduct = new Product("Teddy Bear");

        newProduct.setRegularPrice(25.00);
        newProduct.setDiscount(5);

        product.printInformation();
    }
}
