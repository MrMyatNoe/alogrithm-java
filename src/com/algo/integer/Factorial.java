package com.algo.integer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Factorial{

    public static void main(String[] args) {
//        int fact = factorial(30);
//        System.out.println("factorial is : " + fact);

        int i, j, n, s, x;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in .nextInt();

        s = n + 4 - 1;
        for (i = 1; i <= n; i++) {
            
            for (x = s; x != 0; x--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            
            System.out.println();
            s--;
        }
    }


    final int factorial(int n) {
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact = fact * i;
        }
     return fact;
//        if (n == 0)
//            return 1;
//        else
//            return (n * factorial(n - 1));
        
        
        
    }
}
