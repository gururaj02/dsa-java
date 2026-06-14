package com.guru.dsaConceptsAndProblems.recursion.strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {

        dice("", 4);

        System.out.println(diceRet("", 4));

        diceFace("", 4, 8);

        System.out.println(diceFaceRet("", 4, 8));
    }

    // Dice having 6 face
    public static void dice(String processed, int target) {
        if(target == 0){
            System.out.println(processed);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++) {
            dice(processed + i, target - i);
        }
    }

    public static ArrayList<String> diceRet(String processed, int target) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(processed + i, target - i));
        }

        return list;
    }

    // Dice have custom faces
    public static void diceFace(String processed, int target, int face) {
        if(target == 0){
            System.out.println(processed);
            return;
        }

        for(int i = 1; i <= face && i <= target; i++) {
            diceFace(processed + i, target - i, face);
        }
    }

    public static ArrayList<String> diceFaceRet(String processed, int target, int face) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceRet(processed + i, target - i, face));
        }

        return list;
    }
}
