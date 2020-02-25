package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int size;
        System.out.print("Enter the numbers of elements: ");
        size = scanner.nextInt();
        int[] numbers = getIntegers(size);

        System.out.println("The elements are: ");
        printArray(numbers);

        System.out.println("Sorted elements: ");
        printArray(sortIntegers(numbers));

    }

    public static int[] getIntegers(int size){
        int[] numbers = new int[size];
        for (int i=0; i<numbers.length; i++){
            System.out.print("Enter the number #" + i + ":");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element["+i+"] = "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        //Copying one array to another array
        /*int[] sortedArray = new int[array.length];
        for (int i=0; i<array.length; i++){
            sortedArray[i] = array [i];
        }*/
        int[] sortedArray = Arrays.copyOf(array, array.length); //simple in build method by java


        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
