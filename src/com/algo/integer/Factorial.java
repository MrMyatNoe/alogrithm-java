package com.algo.integer;

public class Factorial {

    public static void main(String[] args) {
        int fact = factorial(30);
        System.out.println("factorial is : " + fact);
    }

    static int factorial(int n) {
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
