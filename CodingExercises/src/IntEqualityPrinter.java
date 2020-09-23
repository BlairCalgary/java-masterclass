public class IntEqualityPrinter {
    public static void printEqual (int num1, int num2, int num3) {
        if ((num1 < 0) || ( num2 < 0) || (num3 < 0)) {
            System.out.println("Invalid Value");
            return;
        }
        if (num1 == num2) {
            if (num2 == num3) {
                System.out.println("All numbers are equal");
                return;
            } else {
                System.out.println("Neither all are equal or different");
                return;
            }
        } else {
            if (num2 == num3) {
                System.out.println("Neither all are equal or different");
                return;
            } else {
                if (num1 == num3){
                    System.out.println("Neither all are equal or different");
                    return;
                } else {
                    System.out.println("All numbers are different");
                    return;
                }
            }
        }
    }
}
