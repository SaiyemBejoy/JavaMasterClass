package com.company;

public class Main {

    public static void main(String[] args) {

        //Sum 3 and 5 Challenge
        int sum=0, count =0;
        for (int i=1; i<=100; i++){
            if((i%3==0) && (i%5==0)){
                sum+=i;
                System.out.println("Found number is = " + i);
                count++;
            }
            if (count==5){
                System.out.println("Exiting the loop");
                break;
            }
        }
        System.out.println("Sum = " + sum +"\n");

        //End of challenge



        for (int i=5;i>0;i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int numberOfPrime=0;
        for (int j=1; j<14; j++){
            if (isPrime(j)){
                numberOfPrime++;
                System.out.println(j + " is a prime number.");
            }
            if(numberOfPrime==5){
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interest){
        return (amount * (interest / 100));
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for(int i=2; i<= (long) Math.sqrt(n); i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

}
