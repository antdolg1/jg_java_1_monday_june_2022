package lesson_3.homework.level_4.Task_16;

class Car {

    String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
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
/*Решение
1. добавил скобки после названия метода
2. добавил точку с запятой после возврата значения переменной
 */