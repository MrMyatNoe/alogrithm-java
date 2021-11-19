package com.algo.string;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] strs = {"This is Noe Htet Noe", 
                          "This is Noe Htet Htet", 
                          "This is Noe Htet Wint"};
        longestPrefix(strs);
    }
    
    static void longestPrefix(String[] strs) {
        int size = strs.length;
        if(size == 0) {
            System.out.println("sorry");
        }
        if(size == 1) {
            System.out.println(strs[0]);
        }
        Arrays.sort(strs);
        
        int maxLength = 0; //1
        while(true) {
            boolean flag = true;
            for (int i = 1; i < strs.length; i++) {
                if(strs[i].length() <= maxLength 
                        || strs[i-1].length() <= maxLength
                        || strs[i].charAt(maxLength) != strs[i-1].charAt(maxLength)) {
                    flag = false;
                    System.out.println("in for if :" + flag);
                    break;
                }
            }
            if(flag) {
                System.out.println("in if :" + flag);
                maxLength++;
            } else {
                break;
            }
        }
        String pre = strs[0].substring(0, maxLength);
        System.out.println(pre);
    }
}
