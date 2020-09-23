package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        minMax();
//        sumOfUserInts();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth: ");
//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); //handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2020-yearOfBirth;
//            if (age>=0 && age<=100) {
//                System.out.println("Your name is " + name +", and you are "+age+" years old.");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//        } else {
//            System.out.println("Unable to parse year of birth.");
//        }
//
//        scanner.close();

//        printSquareStar(5);
//        printSquareStar(8);

//        System.out.println(getLargestPrime(16)); //2
//        System.out.println(getLargestPrime(21)); //7
//        System.out.println(getLargestPrime(217)); //31
//        System.out.println(getLargestPrime(0)); //-1
//        System.out.println(getLargestPrime(45)); //5
//        System.out.println(getLargestPrime(-1)); //-1

//        System.out.println(canPack(1,0,4)); //false
//        System.out.println(canPack(1,0,5)); //true
//        System.out.println(canPack(0,5,4)); //true
//        System.out.println(canPack(2,2,11)); //true
//        System.out.println(canPack(-3,2,12)); //false

//        System.out.println(hasSameLastDigit(41,22,71));
//        System.out.println(hasSameLastDigit(23,32,42));
//        System.out.println(hasSameLastDigit(9,99,999));


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

    public static void minMax() {
        int counter = 1, sum = 0, min = 0, max = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number #"+counter+":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int userInt = scanner.nextInt();
                if (counter==1) {
                    min = userInt;
                } else if (userInt<min) {
                    min = userInt;
                }
                if (userInt>max) {
                    max = userInt;
                }
                sum+=userInt;
                counter++;
                if (counter > 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Max is: "+max);
        System.out.println("Min is: "+min);
        scanner.close();


    }

    public static void sumOfUserInts() {
        int counter = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter <= 10) {
            System.out.println("Enter number #"+counter+":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int userInt = scanner.nextInt();
                sum+=userInt;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Sum of numbers is: "+sum);
        scanner.close();


    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int y = 1; y <= number; y++) {
            for (int x = 1; x <= number; x++) {
                if ((x==1) || (x==number) || (y==1) || (y==number) || (x==y) || (x==number-y+1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static int getLargestPrime(int number) {

        if (number < 2) return -1;
        for (int x = number/2+1;x>1;x--) {
            if (number%x==0){
                boolean isAPrime = true;
                for (int y = (x/2+1);y>1;y--) {
                    if ((x%y==0) && (x!=y)) {
                        isAPrime = false;
                    }
                }
                if (isAPrime) {
                    return x;
                }
            }

        }
        return number;
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) return false;
        int sum = 0;
        int bigBag = 0;
        int smallBag = 0;
        for (int x = 1; x <= bigCount; x++) {
            if (goal-sum >= 5) {
                sum+=5;
                bigBag++;
            }
        }
        for (int x = 1; x <= smallCount; x++) {
            if (goal-sum >= 1) {
                sum+=1;
                smallBag++;
            }
        }
        if (bigBag*5+smallBag==goal) return true;
        return false;
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
