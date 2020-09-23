public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature) {
        int upperTemp = 35;
        if (summer) {
            upperTemp = 45;
        }
        if ((temperature >= 25) && (temperature <= upperTemp)) {
            return true;
        } else {
            return false;
        }
    }
}
