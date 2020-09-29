package academy.learnprogramming;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Car.startEngine(): Starting engine.");
    }

    public void accelerate() {
        System.out.println("Car.accelerate(): Accelerating.");
    }

    public void brake() {
        System.out.println("Car.brake(): Braking.");
    }
}

class SantaFe extends Car {
    public SantaFe() {
        super("SantaFe", 4);
    }
    public void startEngine() {
        System.out.println("SantaFe.startEngine(): Starting "+getCylinders()+" cylinder engine.");
    }

    public void accelerate() {
        System.out.println("SantaFe.accelerate(): Accelerating.");
    }

    public void brake() {
        System.out.println("SantaFe.brake(): Braking.");
    }
}

class SmartFourTwo extends Car {
    public SmartFourTwo() {
        super("SmartFourTwo", 3);
    }
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+".startEngine(): Starting "+getCylinders()+" cylinder engine.");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName()+".accelerate(): Accelerating.");
    }

    public void brake() {
        System.out.println(getClass().getSimpleName()+".brake(): Braking.");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new SantaFe();
        car.startEngine();
        car.accelerate();
        car.brake();

        car = new SmartFourTwo();
        car.startEngine();
        car.accelerate();
        car.brake();
    }
}
