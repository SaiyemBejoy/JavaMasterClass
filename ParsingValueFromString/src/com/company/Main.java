package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number string: ");
        String numberAsString = scanner.nextLine();
        System.out.println("Number as string " + numberAsString);

        scanner.close();

        int number = Integer.parseInt(numberAsString);
        number += 2;
        System.out.println("Number now " + number);
    }
}
