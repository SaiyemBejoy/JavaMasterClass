package com.company;

public class Main {

    public static void main(String[] args) {

        Car toyota = new Car();
        Car kia = new Car();

        toyota.setModel("Alien");
        System.out.println("Model is "+toyota.getModel());
    }
}
