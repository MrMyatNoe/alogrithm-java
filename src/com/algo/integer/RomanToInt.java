package com.algo.integer;

public class RomanToInt {

    public static void main(String[] args) {
        try {
            int output = romanToInt("CCVII");
            System.out.println("output : " + output);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int romanToInt(String s) throws Exception {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            switch (a) {
            case 'I':
                result = (i != s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) ? result - 1
                        : result + 1;
                break;
            case 'V':
                result += 5;
                break;
            case 'X':
                result = (i != s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) ? result - 10
                        : result + 10;
                break;
            case 'L':
                result += 50;
                break;
            case 'C':
                result = (i != s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) ? result - 100
                        : result + 100;
                break;
            case 'M':
                result += 1000;
                break;
            default:
                throw new Exception("Please check your character : " + a);
            }
        }
        return result;
    }

}
