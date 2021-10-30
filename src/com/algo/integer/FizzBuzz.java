package com.algo.integer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public static void main(String[] args) {
        //fizzBuzz(5);
        fizzBuzzJava8(15);
    }
    
    public static void fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
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
