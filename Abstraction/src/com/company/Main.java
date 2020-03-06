package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Jacky");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Bangladeshi fortune teller");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
