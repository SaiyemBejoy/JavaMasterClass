package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValute = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min valute = "+myMinFloatValute+"\nFloat max value = "+myMaxFloatValue);

        double myMinDoubleValute = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min valute = "+myMinDoubleValute+"\nDouble max value = "+myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("MyFloatValue = "+myFloatValue);
        System.out.println("MyDoubleValue = "+myDoubleValue);
    }
}
