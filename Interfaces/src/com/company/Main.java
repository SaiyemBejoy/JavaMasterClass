package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone myPhone;
        myPhone = new DeskPhone(6866707);
        myPhone.powerOn();
        myPhone.callPhone(6866707);
        myPhone.answer();

        myPhone = new MobilePhone(7680411);
        myPhone.powerOn();
        myPhone.callPhone(7680411);
        myPhone.answer();
    }
}
