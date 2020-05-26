package com.company.devices;
import com.company.Transaction;
import com.company.animals.Human;
import java.util.ArrayList;

public abstract class Car extends Device implements Comparable<Car> {
    public final Double engineVolume;
    public Double value;
    public ArrayList<Transaction> transactionHistory = new ArrayList<>();
    public String plates;

    public Car(String producer, String model, Integer yearOfProduction, Double engineVolume){
        super(producer, model, yearOfProduction);
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Car " + this.producer + " " + this.model + " " + this.yearOfProduction + " " + this.engineVolume;
    }

    public boolean hadAnyOwner() {
        return !transactionHistory.isEmpty();
    }

    public boolean isTransactionInHistory(Human seller, Human buyer) {
        for(Transaction transaction : transactionHistory) {
            if(transaction.getSeller() == seller && transaction.getBuyer() == buyer) {
                return true;
            }
        }
        return false;
    }

    public int totalNumberOfTransactions() {
        return transactionHistory.size();
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
        if(transactionHistory.get(this.transactionHistory.size() - 1).getSeller() != seller) {
            throw new Exception("Seller is not an owner. Is he a broker?");
        }
        if(buyer.getCash() < price) {
            buyer.addCar(this);
            seller.removeCar(this);
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            transactionHistory.add(new Transaction(buyer, seller, price));
        }
    }
}
