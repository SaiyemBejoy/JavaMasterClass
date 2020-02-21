package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        /*System.out.print("Enter the value: ");
        int value = scan.nextInt();
        switch (value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value might be 3 or 4 or 5!");
                break;
            default:
                System.out.println("Value was "+value);
                break;
        }*/
        System.out.print("Enter a character: ");
        char testChar = scan.next().charAt(0);
        switch (testChar){
            case 'A': case 'a':
                System.out.println("Letter A");
                break;
            case 'B': case 'b':
                System.out.println("Letter B");
                break;
            case 'C': case 'c':
                System.out.println("Letter C");
                break;
            case 'D': case 'd':
                System.out.println("Letter D");
                break;
            case 'E': case 'e':
                System.out.println("Letter E");
                break;
            default:
                System.out.println("Other character: "+testChar);
                break;
        }


        System.out.print("Enter the name of the month: ");
        String testMonth = scan.next();
        switch (testMonth.toUpperCase()){
            case "JANUARY":
                System.out.println("The month was January");
                break;
            case "FEBRUARY":
                System.out.println("The month was February");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
