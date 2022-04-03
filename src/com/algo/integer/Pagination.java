package com.algo.integer;

import java.util.ArrayList;
import java.util.List;

public class Pagination {
    
    static List<Integer> list = new ArrayList<>();
    final static int fix= 5;

    public static void main(String[] args) {
        getData();
        int req = 0;
        if(req == 0) {
            req = 1;
        }
        pagination(req);
    }
    
    private static List<Integer> getData() {
        for (int i = 1; i <= 50; i++) {
            list.add(i);
        }
        return list;
    }
    
    private static List<Integer> pagination(int currentPage) {
        List<Integer> reList = new ArrayList<>();
        
        if(list.size() == fix) {
            System.out.println(list);
            return list;
        }
        int end = currentPage * fix;
        int from = end - 5;
        reList = list.subList(from, end);
        System.out.println(reList);
        return reList;
    }
}
