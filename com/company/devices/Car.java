package com.company.devices;

public abstract class Car extends Device implements Comparable<Car> {
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

    @Override
    public void turnOn() {
        System.out.println("wrrrm");
    }

    @Override
    public int compareTo(Car other) {
        return this.yearOfProduction - other.yearOfProduction;
    }

    public abstract void refuel();
}
