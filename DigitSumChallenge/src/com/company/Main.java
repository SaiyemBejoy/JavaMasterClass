package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of digits = " + sumDigit(125));
        System.out.println("Sum of digits = " + sumDigit(789));
    }

    private static int sumDigit(int number){
        if(number<10){
            return -1;
        }
        int sum =0 ;
        while (number>0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
