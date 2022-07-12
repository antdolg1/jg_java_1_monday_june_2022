package main.java.students.student_maksim_turcin.lesson_3_homeworks.level_4;

class Car {

    String model;

    Car(String newModel) {

        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
