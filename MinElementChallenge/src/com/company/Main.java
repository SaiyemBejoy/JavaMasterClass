package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the numbers of elements:");
        int count = scanner.nextByte();
        int[] elements = readIntegers(count);

        System.out.println("The minimum number = " +findMin(elements));
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i=0; i<array.length; i++){
            System.out.print("Element #"+i+": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int[] newArray = Arrays.copyOf(array, array.length);
        int minimumNumber = Integer.MAX_VALUE;
        for (int i=1; i<newArray.length; i++){
            if (newArray[i]<minimumNumber){
                minimumNumber = newArray[i];
            }
        }
        return minimumNumber;
    }
}
