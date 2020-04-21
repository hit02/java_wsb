package com.company.devices;

import com.company.Salable;

public class Device implements Salable {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void sell() {
        System.out.println("You sold " + this.toString());
    }
}
