package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = "+ myMinIntValue + "\nInteger Maximum Value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = "+ myMinByteValue + "\nByte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = "+ myMinShortValue + "\nShort Maximum Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = "+ myMinLongValue + "\nLong Maximum Value = " + myMaxLongValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = "+ myMinDoubleValue + "\nDouble Maximum Value = " + myMaxDoubleValue);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = "+ myMinFloatValue + "\nFloat Maximum Value = " + myMaxFloatValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByte = (byte) (myMinByteValue / 2);
        short myNewShort = (short) (myMinShortValue / 2);
    }
}
