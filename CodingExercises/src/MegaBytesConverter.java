public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String output;
        if (kiloBytes < 0) {
             output = "Invalid Value";
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainderKiloBytes = kiloBytes - megaBytes * 1024;
            output = (kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");
        }
        System.out.println(output);
    }
}
