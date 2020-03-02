package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("United Commercial Bank Ltd.");

        bank.addBranch("Tongi");

        bank.addCustomer("Tongi", "Saiyem", 500.25);
        bank.addCustomer("Tongi", "Bejoy", 285.33);
        bank.addCustomer("Tongi", "Jannatus", 812.91);

        bank.addBranch("Uttara");
        bank.addCustomer("Uttara", "Rafat", 150.22);

        bank.addCustomerTransaction("Tongi", "Saiyem", 44.12);
        bank.addCustomerTransaction("Tongi", "Bejoy", 33.33);
        bank.addCustomerTransaction("Tongi", "Jannatus", 185.56);

        bank.listCustomer("Tongi", true);
        bank.listCustomer("Uttara", true);

        if (!bank.addCustomer("College Gate", "Siam", 13.12)){
            System.out.println("Error! College Gate branch does not exists");
        }

        if (!bank.addBranch("Tongi")){
            System.out.println("Tongi branch already exists.");
        }

        if (!bank.addCustomerTransaction("Uttara", "Rakib", 46.45)){
            System.out.println("Customer does not exists.");
        }

        if (!bank.addCustomer("Tongi", "Bejoy", 55.33)){
            System.out.println("Customer Bejoy already exists.");
        }
    }
}
