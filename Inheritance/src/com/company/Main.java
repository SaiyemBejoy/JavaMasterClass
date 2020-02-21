package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(1,1,5,5, "Animal");
        Dog dog = new Dog(8,20,"Jacky", 2, 4, 1,22, "Long silky");
        Fish fish = new Fish(3,2,"Nimo",4,2,1);

        //dog.eat();
        //dog.walk();
        //dog.run();

        fish.swim(30);
    }
}
