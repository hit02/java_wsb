package com.company;

import com.company.animals.Human;

public class Transaction {
    private Human buyer;
    private Human seller;
    private double price;

    public Transaction(Human buyer, Human seller, double price) {
        this.setBuyer(buyer);
        this.setSeller(seller);
        this.setPrice(price);
    }

    public Human getBuyer() {
        return buyer;
    }

    private void setBuyer(Human buyer) {
        this.buyer = buyer;
    }

    public Human getSeller() {
        return seller;
    }

    private void setSeller(Human seller) {
        this.seller = seller;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }
}
