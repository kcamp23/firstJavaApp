package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

//alg 1
public static int getFirstValue(int[] arr) {
    return arr[0];
}

//alg 2
public static int addition(int num) {
    return ++num;
}

//alg 3
public static int search(int arr[], int item) {
    for(int i =0; i<arr.length; i++)
        if(arr[i]==item)
            return i;
    return -1;
}

//alg 4
public static int convert(int minutes) {
    return minutes * 60;
}

//alg 5
public static String giveMeSomething(String a) {
    return ("something " + a);
}


// alg 6
    public static boolean reverse(boolean b) {
        if (b)
            return false;
        else
            return true;
    }


// alg 7

    public static int countWords(String s) {
        return s.split(" ").length;
    }



    //alg 8

    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0) return false;
        for (int i : arr) {
            if (i >= n) return true;
        }
        return false;
    }

    //alg 9

    public static int getCount(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }