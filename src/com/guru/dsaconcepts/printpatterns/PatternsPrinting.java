package com.guru.dsaconcepts.printpatterns;

public class PatternsPrinting {

    public static void main(String[] args) {

        pattern1(4);

        System.out.println();
        pattern2(4);

        System.out.println();
        pattern3(4);

        System.out.println();
        pattern4(4);

        System.out.println();
        pattern5(4);

        System.out.println();
        pattern6(4);

        System.out.println();
        pattern7(4);

        System.out.println();
        pattern8(4);

        System.out.println();
        pattern9(4);

    }

    public static void pattern1(int n) {

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {

        for(int row = 0; row < 2 * n; row++) {

            int totalColsInRow = row > n ? 2 * n - row : row; // find this formula, that's it

            for(int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern6(int n) {

        for(int row = 0; row < 2 * n; row++) {

            int totalColInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColInRow;

            for(int col = 0; col < noOfSpaces; col++) {
                System.out.print(" ");
            }

            for(int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern7(int n) {

        for(int row = 1; row <= n; row++) {

            for(int spaces = 0; spaces < n - row; spaces++) {
                System.out.print("  ");
            }

            for(int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for(int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {

        for(int row = 1; row <= 2 * n - 1; row++) {

            int totalRow = row > n ? 2 * n - row : row;

            for(int spaces = 0; spaces < n - totalRow; spaces++) {
                System.out.print("  ");
            }

            for(int col = totalRow; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for(int col = 2; col <= totalRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {

        int originalN = n;
        n = 2 * n;

        for(int row = 1; row < n ; row++) {

            for(int col = 1; col < n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));

                System.out.print(atEveryIndex + " ");
            }

            System.out.println();
        }
    }
}
