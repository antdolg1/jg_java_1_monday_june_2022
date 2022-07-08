package lesson_3.homework.level_4.Task_15;


class Phone {

    String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}

/*Решение
1. убрал лишнюю скобку у переменной model
2. поменял название конструктора на Phone
 */
