package com.algo.array;

public class TwoSums {

    public static void main(String[] args) {
        int[] array = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = getTwoSumIndex(array, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    // ordinary
    private static int[] getTwoSumIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] { array[i], array[j] };
                }
            }
        }
        return new int[] {};
    }
    
}
