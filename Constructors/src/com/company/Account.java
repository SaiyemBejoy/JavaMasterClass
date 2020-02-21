package com.company;

public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this(1007,20525.55,"MjSaiyem","saiyem@gmail.com","01686670711");
        System.out.println("Empty constructor called!");
    }

    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double amount){
        balance += amount;
        System.out.println("Deposited amount = " + amount + " and Current balance = " + balance);
    }

    public void withdrawFund(double amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println("Withdraw amount = " + amount + " and remaining balance = " + balance);
        }else {
            System.out.println("Insufficient balance!! and the balance is " + balance);
        }
    }
}
