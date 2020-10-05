package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Vancouver");
        addInOrder(placesToVisit, "Calgary");
        addInOrder(placesToVisit, "Regina");
        addInOrder(placesToVisit, "Winnipeg");
        addInOrder(placesToVisit, "Sudbury");
        addInOrder(placesToVisit, "Toronto");
        addInOrder(placesToVisit, "Montreal");


//        placesToVisit.add("Vancouver");
//        placesToVisit.add("Calgary");
//        placesToVisit.add("Regina");
//        placesToVisit.add("Winnipeg");
//        placesToVisit.add("Sudbury");
//        placesToVisit.add("Toronto");
//        placesToVisit.add("Montreal");

        printList(placesToVisit);
        addInOrder(placesToVisit, "Banff");
        addInOrder(placesToVisit, "Montreal");
        printList(placesToVisit);
//        placesToVisit.add(1, "Banff");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
        visit(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting "+ i.next());
        }
        System.out.println("================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        // does not point to first entry, must use .next() to point to first entry
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
//            System.out.println("comparison: "+comparison);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity+" is already included as a destination.");
                return false;
            } else if(comparison>0) {
                // new City should appear before this one
                // B -> A
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison<0) {
                // move on next city
                // A -> B
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " +listIterator.next());

                    } else {
                        System.out.println("Reached the end of the list.");

                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " +listIterator.previous());
                    } else {
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
    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - quit\n" +
                        "1 - next city\n" +
                        "2 - previous city\n" +
                        "3 - print menu options");

    }
}
