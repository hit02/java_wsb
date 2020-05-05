package com.company.devices;

public class Diesel extends Car {
    public Diesel(String producer, String model, Integer yearOfProduction, Double engineVolume){
        super(producer, model, yearOfProduction, engineVolume);
    }
    @Override
    public void refuel() {
        System.out.println("blumblum");
    }
}
