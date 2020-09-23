package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

//        printDayOfTheWeek(8);
//        printNumberInWord(10);
//        char letter = 'G';
//        switch(letter) {
//            case 'A':
//                System.out.println("Letter is A");
//                break;
//            case 'B':
//                System.out.println("Letter is B");
//                break;
//            case 'C':
//                System.out.println("Letter is C");
//                break;
//            case 'D':
//                System.out.println("Letter is D");
//                break;
//            case 'E':
//                System.out.println("Letter is E");
//                break;
//
//            default:
//                System.out.println("Letter is not A, B, C, D or E");
//                break;
//        }

    }
    public static void printDayOfTheWeek(int dayOfWeek) {
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid Day");
                break;
        }

    }
    public static void printNumberInWord(int num) {
        if (num==0) {
            System.out.println("ZERO");


        } else if(num==1) {
            System.out.println("ONE");

        }else if(num==2) {
            System.out.println("TWO");

        }else if(num==3) {
            System.out.println("THREE");

        }else if(num==4) {
            System.out.println("FOUR");

        }else if(num==5) {
            System.out.println("FIVE");

        }else if(num==6) {
            System.out.println("SIX");

        }else if(num==7) {
            System.out.println("SEVEN");

        }else if(num==8) {
            System.out.println("EIGHT");

        }else if(num==9) {
            System.out.println("NINE");

        }else {
            System.out.println("OTHER");

        }
    }
    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        if ((year % 4 == 0)  && (year % 100 > 0)) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            return 30;
        } else if(month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 31;
        }
    }
}
