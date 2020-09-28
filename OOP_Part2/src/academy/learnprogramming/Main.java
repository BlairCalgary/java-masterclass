package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    	Printer printer = new Printer(10, true);
    	printer.printPages(8);
		printer.printPages(14);
		printer.addPaper(100);
		printer.printPages(50);
		printer.printPages(50);
		printer.fillToner(50);
		printer.printPages(50);


//	    Computer computer = new Computer("PC");
//	    Desk desk = new Desk(false);
//
//	    Room office = new Room(computer, desk);
//	    office.enterRoom();
//		office.enterRoom();
    }
}
