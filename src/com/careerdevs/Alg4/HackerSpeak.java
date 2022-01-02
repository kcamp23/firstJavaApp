package com.careerdevs.Alg4;

public class Challenge {
    public static String hackerSpeak(String str) {

        java.util.HashMap<String, String> replaceMap = new java.util.HashMap<String, String>();

        replaceMap.put("a","4");
        replaceMap.put("e","3");
        replaceMap.put("i","1");
        replaceMap.put("o","0");
        replaceMap.put("s","5");

        for(String s: replaceMap.keySet()){
            str = str.replaceAll(s,replaceMap.get(s));
        }

        return str;

    }
}
