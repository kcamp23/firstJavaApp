package com.careerdevs.Alg4;

public class PerValueOrSum {
    public static boolean makesTen(int a, int b) {
        if(a + b == 10 || a == 10 || b == 10){
            return true;
        }
        return false;
    }
}