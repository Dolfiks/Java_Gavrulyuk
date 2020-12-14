package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void SortOnlyC(List<String> list)
    {
        List<String> myList =
                Arrays.asList("a1", "c3", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    public static strictfp void Task2(int n) {
        int[] arr = new int[n];
        Random rand = new Random();

        System.out.print("\n" + Arrays.stream(arr).map(a -> a = rand.nextInt(10)).average().getAsDouble());
        return;
    }

    public static String Task3(String smt)
    {
        for(int i = 0; i < smt.length(); i++)
        {
            if(smt.charAt(i) >= 'h' && smt.charAt(i) <= 't') {
                char gg = (char)(smt.charAt(i) - 32);
                smt = smt.substring(0, i) + gg + smt.substring(i+1);
            }
        }
        System.out.println(smt);
        return smt;
    }

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "c8", "b1", "c12", "c10", "a1", "c5", "b1", "c5", "d1");
        Task2(8);

        String forTask3 = "jgrfjbchfhkglb";
        forTask3 = Task3(forTask3);
        SortOnlyC(myList);
    }
}
