package com.company.devices;

public class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
}
