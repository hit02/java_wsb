package com.company.devices;

public class Car extends Device {
    public final Double engineVolume;
    public Double value;

    public String plates;

    public Car(String producer, String model, Integer yearOfProduction, Double engineVolume){
        super(producer, model, yearOfProduction);
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Car " + this.producer + " " + this.model + " " + this.yearOfProduction + " " + this.engineVolume;
    }
}
