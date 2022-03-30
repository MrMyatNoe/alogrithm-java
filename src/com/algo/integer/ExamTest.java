package com.algo.integer;

import java.util.Scanner;

public class ExamTest {

    public static void main(String[] args) {

        /// 1.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number of rows to print... ");
        int myrows = scanner.nextInt();
        System.out.println("\nThe star pattern is... ");
        for (int row = 1; row <= myrows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
