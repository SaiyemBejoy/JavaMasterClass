package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;//Value type
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue ="+myIntValue);
        System.out.println("anotherIntValue ="+anotherIntValue);

        anotherIntValue++;

        System.out.println("After change myIntValue ="+myIntValue);
        System.out.println("After change anotherIntValue ="+anotherIntValue);

        int[] myIntArray = new int[5];//Reference type
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray= "+ Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("After change anotherArray= "+ Arrays.toString(anotherArray));

        anotherArray = new int[] {1,2,3,4,5};
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray= "+ Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        //array = new int[] {1,2,3,4,5};
    }
}