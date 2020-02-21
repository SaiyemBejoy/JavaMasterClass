package com.company;

public class Main {

    public static void main(String[] args) {

        int playerPosition= calculateHighScorePosition(1500);
        displayHighScorePosition("Tamim",playerPosition);

        playerPosition= calculateHighScorePosition(900);
        displayHighScorePosition("Sakib",playerPosition);

        playerPosition= calculateHighScorePosition(400);
        displayHighScorePosition("Rahim",playerPosition);

        playerPosition= calculateHighScorePosition(50);
        displayHighScorePosition("Somya",playerPosition);
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName +" managed to get into position "+position+ " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){

        /*
        if (playerScore>=1000){
            return 1;
        }else if (playerScore>=500){
            return 2;
        }else if (playerScore>=100){
            return 3;
        }
        return 4;
        */

        int position = 4;

        if (playerScore>=1000){
            position =1;
        }else if (playerScore>=500){
            position = 2;
        }else if (playerScore>=100){
            position = 3;
        }
        return position;
    }

}
