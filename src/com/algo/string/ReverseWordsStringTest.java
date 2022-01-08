package com.algo.string;

public class ReverseWordsStringTest {

    public static void main(String[] args) {
        System.out.println(reverseWords(" Yuzana Lay Myint Aung"));
    }
    
    private static String reverseWords(String s) {
        if(s == null || s.length() == 0) {
            return "String is empty";
        } 
        
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0 ; i--)
            sb.append(arr[i]).append(" ");
        return s.length() == 0 ? "String is empty one " : sb.toString();
    }
}
