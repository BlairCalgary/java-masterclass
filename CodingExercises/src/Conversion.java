public class Conversion {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double totInches = inches + feet * 12;
            double centimeters = totInches * 2.54;
            return centimeters;
        } else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int)(inches / 12);
            double remainderInches = inches % 12;
//            System.out.println("Feet: "+feet);
//            System.out.println("Inches: "+remainderInches);
            double centimeters = calcFeetAndInchesToCentimeters(feet, remainderInches);
            return centimeters;
        } else {
            return -1;
        }
    }
}
