package com.company.animals;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human extends Animal {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Double salary;
    private Car[] garage;
    Integer cash;

    public Human(int garageSize) {
        super("Homo Sapiens");
        garage = new Car[garageSize];
    }

    void setCar(Car vehicle, int index) {
        if(index < garage.length) {
            garage[index] = vehicle;
        }
    }

    double valueOfAllCars() {
        double value = .0;
        for(Car vehicle : garage) {
            value += vehicle.value;
        }
        return value;
    }

    public String toString() {
        return "Human " + firstName + " " + lastName;
    }

    public Double getSalary() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date) + " Current salary: " + salary);
        return salary;
    }

    public void setSalary(Double salary){
        if(salary >= 0) {
            System.out.println("Salary was sent to accountant");
            System.out.println("ZUS and US already know that");
            System.out.println("Please take your annex to the contract from Mrs Hanna from HR");
            this.salary = salary;
        }
    }

    public void sellPet(Human buyer, Integer price){
        if(buyer.cash >= price){
            buyer.cash -= price;
            this.cash += price;
            buyer.pet = this.pet; //FIXME overrides buyers pet!
            this.pet = null;
            System.out.println("Sold " + buyer.pet + " to " + buyer + " for " + price);
        } else {
            System.out.println(buyer + " has not enough money");
        }
    }

    public Car getVehicle(int index) {
        // can throw an exception
        return garage[index];
    }

    public void setVehicle(Car vehicle, int index) {
        if(index >= garage.length) {
            return;
        }
        if(this.salary > vehicle.value) {
            garage[index] = vehicle;
            System.out.println("You bought it");
        } else if(this.salary * 12 > vehicle.value) {
            garage[index] = vehicle;
            System.out.println("You bought it and got a credit");
        } else {
            System.out.println("You can't afford it");
        }
    }

}
