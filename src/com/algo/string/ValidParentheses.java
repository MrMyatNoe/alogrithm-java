package com.algo.string;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        validParentheses("({)");
    }
    
    public static boolean validParentheses(String s) {
        HashMap<Character, Character> charMap = new HashMap<>();
        charMap.put('{', '}');
        charMap.put('(', ')');
        charMap.put('[', ']');
        
        Stack<Character> stacks = new Stack<>();
        
//        for (int i = 0; i < s.length(); i++) {
//            
//            char a = s.charAt(i);
//            
//            if(charMap.containsKey(a)) {
//                stacks.push(a);
//                System.out.println("contains key : " + stacks);
//            }
//            else {
//                stacks.pop();
//                if(stacks.pop() != charMap.get(a)) {
//                    System.out.println("contains values : "+ stacks);
//                    return false;
//                }
//                System.out.println("in else : "+ stacks);
//            }
//            
//            System.out.println("final : "+ stacks);
//    }
        for (int i = 0; i < s.length(); i++) {
            
        
        char a = s.charAt(i);
            if(charMap.keySet().contains(a)) {
                stacks.push(a);
                System.out.println("stacks in key : "+ stacks);
            } else if(charMap.values().contains(a)) {
                System.out.println("stacks in value : "+ stacks);
                System.out.println(stacks.peek());
                if(!stacks.empty() && charMap.get(stacks.peek()) == a) {
                    stacks.pop();
                } else {
                    System.out.println("no");
                    return false;
                }
            }
        }
        
        return stacks.empty();
    }
}
