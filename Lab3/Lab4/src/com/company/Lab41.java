package com.company;
import java.util.*;

public class Lab41 {

    public static int[] sortArray(final int[] array) {

        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }
        System.out.println(Arrays.toString(array));
        return array;

    }

    public static void main(String[] args){
        sortArray(new int[] {5, 3, 2, 8, 1, 4});

        double[] array={1,1,2,1,1};
        double x= Lab42.findUniq(array);
        System.out.println(x);
        double[] arraySecond={0,0,0.55,0,0};
        double y= Lab42.findUniq(arraySecond);
        System.out.println(y);

    }


}