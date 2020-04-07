package com.company.devices;

public class Car extends Device {
    public final Double engineVolume;

    public String plates;
    public Double volume = 1000.0;

    public Car(String producer, String model, Integer yearOfProduction, Double engineVolume){
        super(producer, model, yearOfProduction);
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Car " + this.producer + " " + this.model + " " + this.yearOfProduction + " " + this.engineVolume;
    }
}
