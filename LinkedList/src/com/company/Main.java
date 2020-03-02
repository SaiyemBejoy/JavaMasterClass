package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Saiyem", 23.55);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(55.56);
        System.out.println("Balance for customer "+ customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(2);
        intList.add(4);
        intList.add(6);

        for (int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 8);

        System.out.println("-------------");

        for (int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
