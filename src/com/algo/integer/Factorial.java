package com.algo.integer;

public class Factorial {

    public static void main(String[] args) {
        int fact = factorial(4);
        System.out.println("factorial is : " + fact);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
