public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double param1, double param2) {
        int myFirstCheck = (int)(param1 * 1000);
        int mySecondCheck = (int)(param2 * 1000);

        if (myFirstCheck==mySecondCheck) {
            return true;
        } else {
            return false;
        }
    }
}
