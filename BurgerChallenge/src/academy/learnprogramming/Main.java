package academy.learnprogramming;

class Burger {
    private double price;
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean cheese;

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public double getPrice() {
        return price;
    }

    public String getBun() {
        return bun;
    }

    public String getPatty() {
        return patty;
    }

    public Burger(double price, String bun, String patty) {
        this.price = price;
        this.bun = bun;
        this.patty = patty;
    }

    public void addLettuce() {
        setLettuce(true);
    }
    public void addTomato() {
        setTomato(true);
    }
    public void addOnion() {
        setOnion(true);
    }
    public void addCheese() {
        setCheese(true);
    }
    public void getOrder() {
        double orderPrice = getPrice();
        System.out.println("The order is a "+getClass().getSimpleName()+" with a "+getPatty()+" patty on a "+getBun()+" bun.");
        if ((lettuce) || (tomato) || (onion) || (cheese)){
            System.out.println("Additions:");
            if (lettuce) {
                System.out.println("Lettuce");
                orderPrice += .25;
            }
            if (tomato) {
                System.out.println("Tomato");
                orderPrice += .5;
            }
            if (onion) {
                System.out.println("Onion");
                orderPrice += .75;
            }
            if (cheese) {
                System.out.println("Cheese");
                orderPrice += 1;
            }
        }
        System.out.println("Price is: $"+orderPrice);
    }
}

class VeggieBurger extends Burger {
    private boolean avocado;
    private boolean jalapeno;

    public VeggieBurger(double price, String bun, String patty) {
        super(price, bun, patty);
    }

    public boolean isAvocado() {
        return avocado;
    }

    public void setAvocado(boolean avocado) {
        this.avocado = avocado;
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public void setJalapeno(boolean jalapeno) {
        this.jalapeno = jalapeno;
    }
    public void addAvocado() {
        setAvocado(true);
    }
    public void addJalapeno() {
        setJalapeno(true);
    }

    @Override
    public void getOrder() {
        double orderPrice = getPrice();
        System.out.println("The order is a "+getClass().getSimpleName()+" with a "+getPatty()+" patty on a "+getBun()+" bun.");
        if ((super.isLettuce()) || (super.isTomato()) || (super.isOnion()) || (super.isCheese()) || (isAvocado()) ||(isJalapeno()) ){
            System.out.println("Additions:");
            if (super.isLettuce()) {
                System.out.println("Lettuce");
                orderPrice += .25;
            }
            if (super.isTomato()) {
                System.out.println("Tomato");
                orderPrice += .5;
            }
            if (super.isOnion()) {
                System.out.println("Onion");
                orderPrice += .75;
            }
            if (super.isCheese()) {
                System.out.println("Cheese");
                orderPrice += 1;
            }
            if (this.isAvocado()) {
                System.out.println("Avocado");
                orderPrice += 1.25;
            }
            if (isJalapeno()) {
                System.out.println("Jalapeno");
                orderPrice += 1.5;
            }
        }
        System.out.println("VeggieBurger.getOrder(): Price is: $"+orderPrice);
    }
}

class Deluxe extends Burger {
    private boolean chips;
    private boolean drink;

    public boolean isChips() {
        return chips;
    }

    public void setChips(boolean chips) {
        this.chips = chips;
    }

    public boolean isDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }

    public Deluxe(double price, String bun, String patty) {
        super(price, bun, patty);
        setChips(true);
        setDrink(true);
    }

    @Override
    public void addLettuce() {
        System.out.println("Lettuce not available on the Deluxe.");;
    }

    @Override
    public void addTomato() {
        System.out.println("Tomato not available on the Deluxe.");;
    }

    @Override
    public void addOnion() {
        System.out.println("Onion not available on the Deluxe.");;
    }

    @Override
    public void addCheese() {
        System.out.println("Cheese not available on the Deluxe.");;
    }

    @Override
    public void getOrder() {
        System.out.println("The order is a "+getClass().getSimpleName()+" with a "+getPatty()+" patty on a "+getBun()+" bun.");
        System.out.println("Price is: $"+getPrice());
    }
}

public class Main {

    public static void main(String[] args) {
	    Burger beefBurger = new Burger(5,"white", "beef");
        Burger chickenBurger = new Burger(5,"white", "beef");
        VeggieBurger veggieBurger = new VeggieBurger(8, "GF", "beyond meat");
        Deluxe deluxe = new Deluxe(13, "whole wheat", "lean");

        beefBurger.getOrder();
        beefBurger.addLettuce();
        beefBurger.addCheese();
        beefBurger.getOrder();

        chickenBurger.getOrder();
        chickenBurger.addCheese();
        chickenBurger.addLettuce();
        chickenBurger.addOnion();
        chickenBurger.addTomato();
        chickenBurger.getOrder();

        veggieBurger.getOrder();
        veggieBurger.addAvocado();
        veggieBurger.addJalapeno();
        veggieBurger.getOrder();

        deluxe.getOrder();
        deluxe.addCheese();
        deluxe.addTomato();
        deluxe.getOrder();


    }
}
