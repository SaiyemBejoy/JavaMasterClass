package com.company;

public class Main {

    public static void main(String[] args) {

        byte firstByteNumber = 120;
        short firstShortNumber = 31000;
        int firstIntNumber = 33000;
        long firstLongNumber = 50000L + (10L*(firstByteNumber+firstIntNumber+firstShortNumber));
        System.out.println("Long number = "+ firstLongNumber);
    }
}
