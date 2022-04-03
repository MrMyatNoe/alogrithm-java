package com.algo.integer;

import java.util.ArrayList;
import java.util.List;

public class Pagination {
    
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        try {
            pagination(5, 8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       
    private static List<Integer> getData() {
        Pagination pg = new Pagination();
        for (int i = 1; i <= 20; i++) {
            pg.list.add(i);
        }
        return pg.list;
    }
    
    private static List<Integer> pagination(int from, int end) throws Exception {
        List<Integer> reList = new ArrayList<>();
        List<Integer> dataList = getData();
        if(from > end) {
            throw new Exception("from should be less than end index");
        }
        if(from == end) {
            System.out.println("in zero zero : " + dataList);
            return dataList;
        }
        reList = dataList.subList(from, end);
        System.out.println("after sub : " + reList);
        return reList;
    }
}
