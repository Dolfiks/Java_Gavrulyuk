package com.company;


import java.util.stream.IntStream;

public class findmultiples {
    public static int[] multiples(int m, int n) {

        int[] arr = new int[m];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (i + 1) * n;
            System.out.println(arr[i]);
        }

        return arr;
    }
}
