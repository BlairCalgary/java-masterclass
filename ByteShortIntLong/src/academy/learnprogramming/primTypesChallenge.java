package academy.learnprogramming;

public class primTypesChallenge {
    public static void main(String[] args) {
        byte myFirstByte = 10;
        short myFirstShort = 20;
        int myFirstInt = 50;
        long myFirstLong = 50000L + 10L * (myFirstByte + myFirstShort + myFirstInt);
        System.out.println("MyFirstLong:"+myFirstLong);
    }
}
