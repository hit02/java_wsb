package com.company.devices;

import com.company.animals.Human;

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

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.hasCar(this)) {
            throw new Exception("dont have this car");
        }
        if(!buyer.hasFreeSpace()) {
            throw new Exception("too small garage");
        }
        if(buyer.getCash() < price) {
            seller.removeCar(this);
            buyer.addCar(this);
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
        }
    }
}
