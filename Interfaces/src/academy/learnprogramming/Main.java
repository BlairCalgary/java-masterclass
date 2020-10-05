package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ITelephone blairsphone;
        blairsphone = new DeskPhone(8740901);
        blairsphone.powerOn();
        blairsphone.callPhone(8740901);
        blairsphone.answer();

        blairsphone = new MobilePhone(2764663);
        blairsphone.powerOn();
        blairsphone.callPhone(2764663);
        blairsphone.answer();
    }
}
