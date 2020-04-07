package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.name = "Akita";

        Animal lion = new Animal("lion");
        lion.name = "leo";


        Human me = new Human();
        me.firstName = "Adam";
        me.lastName = "Kowalski";
        me.pet = dog;

        Car dirtyOne = new Car("Fiat", "Bravo", 2015, 1.8);
        dirtyOne.plates = "GDA1234";
        me.setCar(dirtyOne);
        Human wife = new Human();
        wife.firstName = "Żona";
        wife.lastName = "Adama";
        wife.setCar(dirtyOne);

        System.out.println(me);
        System.out.println(wife);
        System.out.println(dirtyOne);
        System.out.println(dog);
    }
}
