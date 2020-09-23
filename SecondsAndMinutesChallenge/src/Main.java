public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(7270));
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainderMinutes = minutes % 60;
        return hours + "h " + remainderMinutes + "m " + seconds +"s";
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        return getDurationString(minutes, remainderSeconds);
    }
}
