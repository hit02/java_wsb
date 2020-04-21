package com.company;

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
    private Car vehicle;
    Integer cash;

    public Human() {
        super("Homo Sapiens");
    }

    void setCar(Car vehicle){
        this.vehicle = vehicle;
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

    public Car getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Car vehicle){
        if(this.salary > vehicle.value) {
            this.vehicle = vehicle;
            System.out.println("You bought it");
        } else if(this.salary * 12 > vehicle.value) {
            this.vehicle = vehicle;
            System.out.println("You bought it and got a credit");
        } else {
            System.out.println("You can't afford it");
        }
    }

}
