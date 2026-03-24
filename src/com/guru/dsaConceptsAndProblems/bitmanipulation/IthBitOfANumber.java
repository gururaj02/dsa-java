package com.guru.dsaConceptsAndProblems.bitmanipulation;

public class IthBitOfANumber {

    public static void main(String[] args) {
        int num = 12;
        int i = 2;

        ithBit(i, num);
    }

    static void ithBit(int i, int num) {
        int mask = 1 << i;

        if((num & mask) == 0) {
            System.out.println("Bit is 0 : " + (num & mask));
        }
        else {
            System.out.println("Bit is 1 : " + (num & mask));
        }
    }
}
