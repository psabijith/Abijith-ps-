package com.aitrich.multithreading.problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            nums[i] = n;
        }
        for(int j = 0 ; j < 10 ; j++) {
        	SquareOfNumbers sq = new SquareOfNumbers(nums[j]);
        	sq.start();
        }

        sc.close();
    }
}
