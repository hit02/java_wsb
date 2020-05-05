package com.company.devices;

public class Electric extends Car {
    public Electric(String producer, String model, Integer yearOfProduction, Double engineVolume){
        super(producer, model, yearOfProduction, engineVolume);
    }
    @Override
    public void refuel() {
        System.out.println("wzzzz");
    }
}
