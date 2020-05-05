package com.company;

import com.company.animals.Animal;
import com.company.animals.FarmAnimal;
import com.company.animals.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
        FarmAnimal lion = new FarmAnimal("lion");
        lion.feed(8.0);
        lion.beEaten();
    }
}
