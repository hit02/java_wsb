package com.company.devices;

public class LPG extends Car {
    public LPG(String producer, String model, Integer yearOfProduction, Double engineVolume){
        super(producer, model, yearOfProduction, engineVolume);
    }

    @Override
    public void refuel() {
        System.out.println("bulbulbul");
    }
}
