package com.company;

import com.company.animals.FarmAnimal;
import com.company.devices.LPG;

public class Main {

    public static void main(String[] args) {
        FarmAnimal lion = new FarmAnimal("lion");
        lion.feed(8.0);
        lion.beEaten();
        LPG car = new LPG("car", "super", 2020, 8.0);
        car.turnOn();
        car.refuel();
    }
}
