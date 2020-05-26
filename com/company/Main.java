package com.company;

import com.company.animals.Human;
import com.company.devices.Car;
import com.company.devices.LPG;

public class Main {

    public static void main(String[] args) throws Exception {
        Human human1 = new Human(1);
        Human human2 = new Human(1);
        human1.setCash(10000.0);
        human2.setCash(10000.0);
        Car car = new LPG("producer", "model", 2020, 1.1);
        System.out.println(car.totalNumberOfTransactions());
        human1.addCar(car);
        car.transactionHistory.add(new Transaction(null, human1, 0));
        System.out.println(car.totalNumberOfTransactions());
        car.sell(human1, human2, 8000.0);
        System.out.println(car.totalNumberOfTransactions());
        System.out.println(car.isTransactionInHistory(human1, human2));
        System.out.println(car.isTransactionInHistory(human2, human1));
    }
}
