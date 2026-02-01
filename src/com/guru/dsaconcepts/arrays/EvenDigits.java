package com.guru.dsaconcepts.arrays;

public class EvenDigits {

    public static void main(String[] args) {

        int[] arr = {12, 354, 2, 6, 87, 7896};

        System.out.println(findNumbers(arr) + " contains even digits");

        System.out.println(digits(-2));
        System.out.println(digits(0));

        System.out.println(digits2(-12345));
        System.out.println(digits2(12345));

    }

    public static int findNumbers(int[] arr) {

        int count = 0;
        for(int num : arr) {
            if(isEven(num)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isEven(int num) {
        int noOfDigits = digits(num);

        return noOfDigits % 2 == 0;

    }

    public static int digits(int num) {
        int count = 0;

        // Edge cases
        if(num == 0) {
            return 1;
        }
        if(num < 0) {
            num = num * -1;
        }

        while(num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    // Another way of find no of digits
    public static int digits2(int num) {
        int count = 0;

        // Edge cases
        if(num == 0) {
            return 1;
        }
        if(num < 0) {
            num = num * -1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
