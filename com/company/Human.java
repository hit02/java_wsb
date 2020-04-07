package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Double salary;
    Car vehicle;

    void setCar(Car vehicle){
        this.vehicle = vehicle;
    }

    public String toString() {
        return "Human " + firstName + " " + lastName;
    }

}
