package com.company;

public class Main {

    public static void main(String[] args) {

        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double addMultiply = (firstNumber+secondNumber)*1000.00d;
        System.out.println("Result = "+addMultiply);
        double remainder = addMultiply % 40.00d;
        System.out.println("Remainder = "+remainder);
        boolean isZero = (remainder==0) ? true:false;

        System.out.println("Boolean value = "+isZero);

        if(!isZero){
            System.out.println("Got some remainder");
        }
    }
}
