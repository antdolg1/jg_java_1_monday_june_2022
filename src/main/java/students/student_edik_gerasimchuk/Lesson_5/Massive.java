package main.java.students.student_Edik_Gerasimchuk.Lesson_5;

public class Massive {

    public static void main(String[] args) {

        String[] vehicles = new String[5];

        vehicles[0] = "Car";
        vehicles[1] = "Bus";
        vehicles[2] = "Ship";
        vehicles[3] = "Motorbike";
        vehicles[4] = "Truck";

        //  String[] vehicles = {"Car","Bus","Ship"};

        System.out.println("Vehicles array length is :" + vehicles.length);

        System.out.println("Under index 2 we have vehicle: " + vehicles[2]);

        for (String vehicle : vehicles) {

            System.out.println(vehicle + " ");
        }

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("[" + i + "] " + vehicles[i]);
        }

        int[] numbers = {1, 2, 3, 4, 5};

        int sumNumbers = 0;

        for (int element : numbers) {
            sumNumbers = sumNumbers + element;
         //   sumNumbers += element; - this is the same as first one =)
        }

        System.out.println("Sum of numbers inside array = " +sumNumbers );
        System.out.println("Sum of array numbers from static method: " +ArraysUtils.sumOfArrayNumbers(numbers));

    }
}
