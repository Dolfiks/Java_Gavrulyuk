package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String s ="All this night i did labs on java";
        String longest = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longest);

        ///////////////////////////////////////////////
        System.out.println("--------------------------------------------------------------------------");

        test(hasNoneLetters("abcdef", "llh"), false,"1");
        test(hasNoneLetters("abcdef", "gh"), false, "2");
        test(hasNoneLetters("ABCD", "def"), false, "3");
        test(hasNoneLetters("abcd", "DEF"), false, "4");

        System.out.println("----------------------------------------------------------------");

    findmultiples.multiples(3,5);

        System.out.println("-----------------------------------------------");


        ArrayReverser.reverse(new String[]{"I", "love", "this", "lab", "because", "I`m", "crazy"});




    }
    public static strictfp String task3(int seconds) {
        if(seconds > 369999)
            return "ERROR";

        String time = null;
        int hh = 0, mm = 0, ss = seconds;

        hh = ss/60/60;
        mm = (ss/60 - hh*60);
        ss = ss - hh*60*60 - mm*60;

        time = hh + ":" + mm + ":" + ss;

        System.out.println(time);
        return time;
    }






    private static boolean hasNoneLetters(String blacklist, String phrase) {
        char[] one = blacklist.toLowerCase().toCharArray();
        char[] two = phrase.toLowerCase().toCharArray();
        boolean duplicate = true;
        for (char i : one){
            for (char j : two){
                if (i == j){
                    duplicate = false;
                }
            }
        }
        System.out.println(one);
        System.out.println(two);
        return duplicate;
    }



    private static void test(boolean actual, boolean expected, String testName) {
            String errorMessage = String.format(
                    testName,
                    actual,
                    expected);
            System.out.println(actual);
    }
}