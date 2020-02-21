package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is my string";
        System.out.println("My string is equal to "+myString);
        myString = myString + ", more string";
        System.out.println("My string is equal to "+myString);
        myString = myString + " \u00A92020";
        System.out.println("My string is equal to "+myString);
        String numberString = "255.55";
        numberString = numberString + "49.55";
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        int number = Integer.parseInt(lastString);
        System.out.println("Last string is equal to "+lastString);
        System.out.println(number+1);

    }
}
