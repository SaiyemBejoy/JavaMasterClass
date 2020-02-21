package com.company;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(72);
        System.out.println(getDurationString(302,50));
        System.out.println(getDurationString(5023));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || ((inches<0) || (inches>12))){
            System.out.println("Invalid input");
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println(feet + "feet, " + inches + " inches = " + centimeter + " cm");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            System.out.println("Invalid input");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainInches =(int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet +" feet, "+ remainInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainInches);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || ((seconds<0)||(seconds>59))){
            return "Invalid value";
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        return (hour+"h "+remainingMinutes+"m "+seconds+"s");
    }

    public static String getDurationString(int seconds){
        if (seconds<0){
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

}
