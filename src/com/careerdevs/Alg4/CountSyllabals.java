package com.careerdevs.Alg4;


public class Challenge {
    public static int numberSyllables(String word) {
        String str[] = word.split("-");
        return str.length;
    }
}
