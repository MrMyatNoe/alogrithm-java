package com.algo.integer;

public class Palindrome extends Factorial{
    
    public static void main(String[] args) {
        int r, sum = 0, temp;
        int n = 2002;
        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder // 4 5
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
