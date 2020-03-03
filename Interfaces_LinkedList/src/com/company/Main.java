package com.company;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Scream Aim Fire", "Bullet for my valentine");
        album.addSong("Scream aim fire", 4.02);
        album.addSong("Tears don't fall", 4.30);
        album.addSong("Your betrayal", 5.05);
        album.addSong("Waking the demon", 4.48);
        album.addSong("Take it out on me", 5.30);

        albums.add(album);

        album = new Album("Venom", "Bullet for you valentine");
        album.addSong("Venom", 3.50);
        album.addSong("No way out", 3.58);
        album.addSong("Pretty on the out site", 4.15);
        album.addSong("Alone", 5.00);

        albums.add(album);

        List<Song> playList = new ArrayList<Song>();
        albums.get(0).addToPlayList("Waking the demon", playList);
        albums.get(0).addToPlayList("Tears don't fall", playList);
        albums.get(0).addToPlayList("Don't need you", playList); //does not exist
        albums.get(0).addToPlayList(5,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(5,playList); //does not exist

        play(playList);

    }

    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0){
            System.out.println("No songs in the playlist");
            return;
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward =true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward =false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward =false;
                        }else {
                            System.out.println("We are at the start of the list");
                        }
                    }else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying "+ listIterator.next().toString());
                            forward = true;
                        }else {
                            System.out.println("We have reached end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous());
                        }
                    }
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions\npress");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list songs in the playlist\n"+
                "5 - print available actions\n"+
                "6 - remove current song from the playlist");
    }

    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=========================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }

}
