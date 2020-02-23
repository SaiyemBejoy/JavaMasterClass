package com.company;

public class Main {

    public static void main(String[] args) {

        /*Player player = new Player();
        player.name="Saiyem";
        player.health= 20;
        player.weapon= "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health "+player.healthRemaining());*/


        EnhancedPlayer player = new EnhancedPlayer("BEJOY",55,"Sword");
        System.out.println("Player health is "+player.getHealth());
    }
}
