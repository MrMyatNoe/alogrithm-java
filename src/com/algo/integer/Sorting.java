package com.algo.integer;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    
    
    public static void main(String[] args) {
        try {
            List<String> data = new ArrayList<>();
            int num = 0, start = 0;
            num += 2;
            data = getData(start,num,"next");
            System.out.println(data);
            start += 2;
            num += 2;
            data = getData(start,num, "next");
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static List<String> westlifes(){
        List<String> westlife = new ArrayList<>();
        westlife.add("shane");
        westlife.add("kian");
        westlife.add("mark");
        westlife.add("bryan");
        westlife.add("nicky");
        westlife.add("harry");
        // System.out.println(westlife);
        return westlife;
    }
    
    public static List<String> getData(int startpoint,int count,String next) throws Exception{
        if(count == 0) {
            throw new Exception("Count must be greater than zero");
        }
        List<String> realData = westlifes();
        List<String> newData = new ArrayList<>();
        
        if(count > realData.size()) {
            return realData;
        }
        int start = startpoint;
        int end = count;
        newData = realData.subList(start, end);
        return newData;
        
    }
}
