package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));


//        System.out.println(hasSharedDigit(12,23));
//        System.out.println(hasSharedDigit(9,99));
//        System.out.println(hasSharedDigit(15,55));
//        System.out.println(hasSharedDigit(12,13));


//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(252));
//        System.out.println(getEvenDigitSum(-22));

//        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(sumFirstAndLastDigit(257));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(-10));


//
//        System.out.println(isPalindrome(-1221));
//        System.out.println(isPalindrome(707));
//        System.out.println(isPalindrome(11212));



//        System.out.println(sumDigits(666));

//        System.out.println(sumOdd(1,100));
//        System.out.println(sumOdd(-1,100));
//        System.out.println(sumOdd(100,100));
//        System.out.println(sumOdd(13,13));
//        System.out.println(sumOdd(100,-100));
//        System.out.println(sumOdd(100,1000));
//        int counter = 0;
//        int total = 0;
//        for (int x = 1; x <= 1000; x++) {
//
//            if ((x % 3 == 0) && (x % 5 == 0)) {
//                counter++;
//                total+=x;
//                System.out.println(x+" is divisible by 3 and 5.");
//                if (counter==5) {
//                    break;
//                }
//            }
//        }
//        System.out.println("The total is "+ total);

        //        primeScan(57,69);

//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));
//        System.out.println(getDaysInMonth(1, 2020));
//        System.out.println(getDaysInMonth(2, 2020));
//        System.out.println(getDaysInMonth(2, 2018));
//        System.out.println(getDaysInMonth(-1, 2020));
//        System.out.println(getDaysInMonth(1, -2020));

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
    public static boolean hasSameLastDigit (int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) return false;
        int lastDigit1 = n1 % 10, lastDigit2 = n2 % 10, lastDigit3 = n3 % 10;
        if (lastDigit1 == lastDigit2) {
            return true;
        } else if (lastDigit1 == lastDigit3) {
            return true;
        } else if (lastDigit2 == lastDigit3) {
            return true;
        }
        return false;
    }
    public static boolean isValid (int number) {
        if ((number < 10) || (number > 1000)) return false;
        return true;
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) return false;
        int digit1 = 0, digit2 = 0;
        while (num1!=0) {
            digit1 = num1 % 10;
            int tempNum = num2;
            while (tempNum!=0) {
                digit2 = tempNum % 10;
                if (digit1 == digit2) {
                    return true;
                }
                tempNum /= 10;
            }
            num1 /= 10;
        }
        return false;
    }
    public static int getEvenDigitSum(int num){
        int digit = 0, sum = 0;
        if (num < 0) return -1;
        while(num!=0) {
            digit = num % 10;
            if (digit%2==0) {
                sum+=digit;
            }
            num /= 10;
        }
        return sum;
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num<0) {
            return -1;
        }
        int lastDigit = num % 10, firstDigit = 0;
        while(num!=0) {
            firstDigit = num % 10;
            num /= 10;
        }
        return lastDigit + firstDigit;
    }

    public static boolean isPalindrome(int num) {
        int number = num;
        int palindrome = 0;
        int digit = 0;
        while(number!=0) {
            digit = number % 10; //-1221//-1
            palindrome=palindrome*10+digit; // 0*10=0+3=3//3*10=30+2=32//32*10=320+1=321
            number /= 10; // 12 // 1
        }
        return (palindrome==num);
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;


        while (number>0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;

    }

    public static boolean isOdd(int num) {
        if (num<=0) {
            return false;
        };
        return (num%2!=0);
    }
    public static int sumOdd (int start, int end) {
        if ((start < 1) || (end < 1) || (end < start)) {
            return -1;
        }
        int sum = 0;
        for (int x = start; x <= end; x++) {
            if (isOdd(x)) {
                sum+=x;
            }
        }
        return sum;
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
    public static void primeScan(int start, int end) {
        int counter = 0;
        for(int n=start; n<=end; n++) {
            if (isPrime(n)) {
                System.out.println("Found prime number: "+n);
                counter++;
                if (counter >= 3) {
                    System.out.println("Found 3 prime numbers");
                    break;
                }
            }
        }
        System.out.println("Scan complete");
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
