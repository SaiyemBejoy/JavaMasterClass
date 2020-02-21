package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1+2; //1+2=3
        System.out.println("1+2= "+result);
        int previousResult = result;
        System.out.println("Previous result= "+previousResult);
        result = result -1;     //3-1=2
        System.out.println("3-1= "+result);

        result = result * 10;
        System.out.println("2*10= "+result);

        result = result / 5;
        System.out.println("20/5= "+result);

        result = result % 3;
        System.out.println("4 % 3= "+result);

        // result = result + 1

        result++;
        System.out.println("1+1 = "+result);

        //result = result -1
        result--;
        System.out.println("2-1 = "+result);

        //result = result + 2;
        result+=2;
        System.out.println("1+2= "+result);

        // result = result *10
        result*=10;
        System.out.println("3*10= "+result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("Scared of aliens");
        }

        int topScore = 100;
        if (topScore > 99){
            System.out.println("You got the high score");
        }
        int secondTopScore = 60;
        if ((topScore >=100) && (secondTopScore<=100)){
            System.out.println("You made it");
        }

        boolean isCar = false;

        boolean wasCar = isCar ? true : false;
    }
}
