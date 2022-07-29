package main.java.students.student_Alisa_Sinavska.lesson_3.level_2.level_7;

public class BottleOfWineDemo {
    public static void main(final String[] args) {

        final BottleOfWine bottleOfWine = new BottleOfWine("red");
        bottleOfWine.drinking(); // а как в данном случае можно сделать чтобы не было новой строчки?
        System.out.print(bottleOfWine.quantity * bottleOfWine.volume + " ml of wine");

    }
}
