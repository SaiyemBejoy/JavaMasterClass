package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Dhaka");
        addInOrder(placesToVisit, "Khulna");
        addInOrder(placesToVisit, "Chottogram");
        addInOrder(placesToVisit, "Rangpur");
        addInOrder(placesToVisit, "Tangail");
        addInOrder(placesToVisit, "Sylhet");
        addInOrder(placesToVisit, "Rajshahi");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Abdullahpur");
        addInOrder(placesToVisit, "Dhaka");
        printList(placesToVisit);
        visit(placesToVisit);

        /*placesToVisit.add("Khulna");
        placesToVisit.add("Chottogram");
        placesToVisit.add("Rangpur");
        placesToVisit.add("Tangail");
        placesToVisit.add("Sylhet");
        placesToVisit.add("Rajshahi");
        placesToVisit.add("Dhaka");

        printList(placesToVisit);

        placesToVisit.add(1, "Meherpur");
        printList(placesToVisit);

        placesToVisit.remove(3);
        printList(placesToVisit);*/
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();

        while (i.hasNext()){
            System.out.println("Now visiting "+ i.next());
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if (comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison<0){
                //move to next city automatically because we used next() in top
            }
        }
        stringListIterator.add(newCity);
        return true;
    }


    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        }else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday is over..");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of the line");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n"+
                "1 - go to next city\n"+
                "2 - go to previous city\n"+
                "3 - print menu options");
    }

}
