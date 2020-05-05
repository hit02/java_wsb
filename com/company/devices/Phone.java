package com.company.devices;

public class Phone extends Device {
    Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("blep blop");
    }
}
