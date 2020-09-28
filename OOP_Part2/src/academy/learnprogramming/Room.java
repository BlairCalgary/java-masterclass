package academy.learnprogramming;

public class Room {
    private Computer computer;
    private Desk desk;

    public Room(Computer computer, Desk desk) {
        this.computer = computer;
        this.desk = desk;
    }

    public void enterRoom() {
        computer.turnOn();
        desk.openDrawer();
    }
}
