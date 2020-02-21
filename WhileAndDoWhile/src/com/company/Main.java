package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        int evenNumbers = 0;
        while (count!=20){
            if(isEvenNumber(count)){
                System.out.println(count + " is an even number.");
                evenNumbers++;
            }
            if (evenNumbers == 5){
                break;
            }
            count++;
        }
        System.out.println("Total even numbers found = " + evenNumbers);
    }

    private static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
