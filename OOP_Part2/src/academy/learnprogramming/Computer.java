package academy.learnprogramming;

public class Computer {
    private String type;

    public Computer(String type) {
        this.type = type;
    }

    private String getType() {
        return type;
    }

    public void turnOn() {
        System.out.println("Turning on " + this.type + " computer.");
    }

}
