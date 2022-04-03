package com.algo.string;

public class IsStringPalindrome {
    
    public static void main(String[] args) {
        String req = "Abba";
        String rev = new StringBuffer(req.toLowerCase()).reverse().toString();
        System.out.println(req.toLowerCase().equals(rev));
    }
}
