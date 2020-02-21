package com.company;

public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account();

        System.out.println("Balance = " + myAccount.getBalance());

        myAccount.depositFund(220.30);

        myAccount.withdrawFund(20000.20);

        VipCustomer mishti = new VipCustomer();
        System.out.println(mishti.getName()+" "+mishti.getCreditLimit()+" "+mishti.getEmail());
    }
}
