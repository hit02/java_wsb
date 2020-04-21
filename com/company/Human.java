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
    Car vehicle;

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

}
