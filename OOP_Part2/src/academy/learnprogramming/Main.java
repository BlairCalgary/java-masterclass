package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Computer computer = new Computer("PC");
	    Desk desk = new Desk(false);

	    Room office = new Room(computer, desk);
	    office.enterRoom();
		office.enterRoom();
    }
}
