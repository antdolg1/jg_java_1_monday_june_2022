package lesson_3.homework.level_4.Task_17;

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) { //добавлена запятая между аргументами
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;//поменял на числовую переменную moneyAmount.
    }

    String getOwnerFirstName() { //добавил закрывающую скобку методу
        return this.ownerFirstName;//добавил точку с запятой после инструкции
    }

    String getOwnerLastName() {//добавил открывающую скобку методу
        return this.ownerLastName;//поменял переменную на ownerLastName и добавил точку с запятой после инструкции
    }

    int getMoneyAmount() { //поменял на метод, возвращающий тип данных int
        return this.moneyAmount;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName(); //изменил название переменной на ownerLastName
        int moneyAmount = bankAccount.getMoneyAmount(); //поменял тип переменной на int
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}
