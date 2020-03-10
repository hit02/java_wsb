package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.name = "Akita";

        Animal lion = new Animal("lion");
        lion.name = "leo";


        Human me = new Human();
        me.firstName = "Mil";
        me.lastName = "Chr";
        me.pet = dog;

        System.out.println(me.pet.name);

        dog.feed();


    }
}
