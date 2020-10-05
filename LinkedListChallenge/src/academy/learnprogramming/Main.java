package academy.learnprogramming;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        // write your code here

        Album album = new Album("Stormbringer","Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock", 4.6);
        album.addSong("I put the finger on you", 4.22);
        album.addSong("Let's go", 4.3);
        album.addSong("Inject the venom", 5.6);
        album.addSong("Snowballed", 3.21);
        album.addSong("Evil walks", 6.23);
        album.addSong("C.O.D.", 4.27);
        album.addSong("Breaking the rules", 4.2);
        album.addSong("Night of the long knives", 3.13);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList); // does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); // does not exist

        play(playList);


    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();

                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing "+ listIterator.next().toString());

                    } else {
                        System.out.println("We hae reached theend of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start ofthe playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying "+listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " +listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of list.");
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
                    if(playList.size()>0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing "+listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing "+listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Abailable actions:\npress");
        System.out.println("0 - quit\n" +
                "1 - next song\n" +
                "2 - previous song\n" +
                "3 - replay current\n" +
                "4 - list all songs\n" +
                "5 - options\n" +
                "6 - delete current");
    }
    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("========================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("========================");
    }

}
