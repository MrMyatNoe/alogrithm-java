package com.algo.integer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public static void main(String[] args) {
        try {
            fizzBuzz(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //fizzBuzzJava8(15);
    }
    
    public static List<String> fizzBuzz(int n) throws Exception {
        List<String> list = new ArrayList<>();
        if(n <= 0) {
            throw new Exception("Please check number");
        }
        for (int i = 1; i <= n; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                list.add("fizzbuzz");
            } 
            else if(i % 3 == 0) {
                list.add("fizz");
            }
            else if(i % 5 == 0) {
                list.add("buzz");
            }
            else {
                list.add(String.valueOf(i));
            }
        }
        list.toArray();
        System.out.println(list);
        return list;
     }
    
    public static void fizzBuzzJava8(int number) {
        
        Stream<Object> stream = 
         IntStream.rangeClosed(1, number).mapToObj(n -> {if (n % 15 == 0) return "FizzBuzz";
        else if (n % 3 == 0) return "Fizz";
        else if (n % 5 == 0) return "Buzz";
        else return n;
    });
        List<Object> list = stream.collect(Collectors.toList());
        System.out.println(list);
        
    }
}
