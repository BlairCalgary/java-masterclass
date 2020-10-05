package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] >= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    private static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(4);

//        int[] array = { 106, 26, 81, 5, 15 };
        System.out.println("Original array: "+Arrays.toString(myIntegers));
//        System.out.println("Min element: "+findMin(myIntegers));
        reverseArray(myIntegers);

        System.out.println("After reverse: "+Arrays.toString(myIntegers));
//        mergeSort(myIntegers, myIntegers.length);
//        int[] sortedArray = myIntegers;
//        System.out.println("Sorted array: "+Arrays.toString(sortedArray));
        scanner.close();

    }

    public static void reverseArray(int[] array) {
        for (int x = 0; x < array.length/2; x++) {
            int temp = array[x];
            array[x]=array[array.length-x-1];
            array[array.length-x-1]=temp;
        }
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int x = 0; x<array.length;x++) { //10,20,30,40,50
            if (array[x]<min) {//100000<10
                min = array[x];
            }
        }
        return min;
    }
}

