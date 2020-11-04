package com.company;

public class ArrayReverser
{
    public static String[] reverse(String[] a)
    {
        String joined = new StringBuilder(String.join("", a)).reverse().toString();
        String[] result = new String[a.length];
        int begin = 0;
        for(int i=0; i<a.length; i++){
            result[i] = joined.substring(begin, begin+a[i].length());
            begin += a[i].length();
            System.out.print(result[i]+" ");
        }

        return result;
    }

}
