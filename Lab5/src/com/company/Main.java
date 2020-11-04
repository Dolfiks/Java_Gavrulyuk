

package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static strictfp void Task1(String str) {
        if (str.matches("^[a-zA-Z]+$")) {
            System.out.print("ERROR");
        } else {
            str = str + "\n";
            double ans = 0.0D;
            double t = 0.0D;
            int funI = 0;

            for(int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) - 48 >= 0 && str.charAt(i) - 48 <= 9) {
                    t = t * 10.0D + (double)(str.charAt(i) - 48);
                } else if (ans != 0.0D && t != 0.0D) {
                    switch(str.charAt(funI)) {
                        case '*':
                            ans *= t;
                            t = 0.0D;
                            funI = i;
                            break;
                        case '+':
                            ans += t;
                            t = 0.0D;
                            funI = i;
                        case ',':
                        case '.':
                        default:
                            break;
                        case '-':
                            ans -= t;
                            t = 0.0D;
                            funI = i;
                            break;
                        case '/':
                            ans /= t;
                            t = 0.0D;
                            funI = i;
                    }
                } else {
                    ans = t;
                    t = 0.0D;
                    funI = i;
                }
            }

            System.out.println(ans);
        }
    }

    public static void Task2(int n) {
        int[] arr = new int[n];
        int n2 = Math.round((float)(n / 2));
        int k = 0;
        if (n % 2 == 0) {
            k = 1;
        }

        int i;
        for(i = 0; i < n2; arr[n2 + i] = i++) {
            arr[n2 - i - k] = i;
        }

        for(i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n");
    }

    public static void Task3() {
        Scanner in = new Scanner(System.in);
        String entstr = null;
        String str = "";
        boolean var3 = false;

        while(true) {
            System.out.print("1: Enter a new value\n2: Show all entered values\n3: Exit\n");
            int c = in.nextInt();
            boolean ind = false;
            switch(c) {
                case 1:
                    System.out.print("Enter a new valuse:\n");
                    entstr = in.next();
                    if (entstr.charAt(0) == '+') {
                        if (str == "") {
                            str = str + entstr.substring(1);
                        } else {
                            str = str + ", " + entstr.substring(1);
                        }

                        entstr = null;
                    } else if (entstr.charAt(0) == '-') {
                        if (str.indexOf(entstr.substring(1)) == 0) {
                            str = str.substring(entstr.length() + 1);
                        } else {
                            String var10000 = str.substring(0, str.indexOf(entstr.substring(1)) - 2);
                            str = var10000 + str.substring(str.indexOf(entstr.substring(1)) - 1 + entstr.length());
                        }

                        entstr = null;
                    } else {
                        System.out.print("ERROR\n");
                    }
                    break;
                case 2:
                    System.out.print(str + "\n");
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void main(String[] args) {

        Task2(12);
        Task1("100+10*2/5*113/12*8973");

        Task3();
    }
}
