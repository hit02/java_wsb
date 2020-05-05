package com.company.animals;

import com.company.Salable;

import java.io.File;

public abstract class Animal implements Salable, Feedable, Edible {
    String name;
    final String species;
    private Double weight;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGH = 190.0;
    static final Double DEFAULT_MOUSE_WEIGH = .5;

    public String toString() {
        return "Pet " + species + " " + name + " " + weight;
    }

    public Animal(String species) {
        this.species = species;
        if(species=="dog"){
            this.weight=DEFAULT_DOG_WEIGHT;
        }
        else if(species=="lion"){
            this.weight=DEFAULT_LION_WEIGH;
        }else if(species=="mouse"){
            this.weight=DEFAULT_MOUSE_WEIGH;
        }
    }

    void walk() {
        if(weight > 0){
            weight--;
            if(weight == 0){
                System.out.println("I'm dead now :<");
            }
            else{
                System.out.println("Thanks buddy, my weight is now " + weight);
            }
        }
        else{
            System.out.println("I'm dead, man");
        }
    }

    @Override
    public void feed() {
        feed(1.0);
    }

    @Override
    public void feed(Double foodWeight) {
        if(weight > 0){
            weight += foodWeight;
            System.out.println("thx for food bro, my weight is now " + weight);
        }
        else{
            System.out.println("I'm dead, man");
        }
    }

    @Override
    public void sell() {
        if(this instanceof Human) {
            System.out.println("No");
        } else {
            System.out.println("You sold " + this.toString());
        }
    }

    @Override
    public void beEaten() {
        if(this instanceof Pet){
            System.out.println("no");
        }
        else {
            System.out.println("You digested" + this.toString());
        }
    }
}
