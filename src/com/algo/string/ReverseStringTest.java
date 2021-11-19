package com.algo.string;

public class ReverseStringTest {

    public static void main(String[] args) {
        reverseString("This is myat noe");
    }
    
    static void reverseString(String s){
        char[] inputArray = s.toCharArray();
        int left = 0,right = 0;
        right = s.length() - 1;
        
        for (left = 0; left < right; left++, right--) {
            char temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
        }
        
        for (char c : inputArray) {
            System.out.print(c);
        }
    }
}
