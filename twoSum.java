//package com.pluralsight.calcengine;

import java.util.*;

class twoSum {
    public static void main(String[] args) {
        int[] arr= new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int target=10;
        //Integer target=Integer.parseInt(args[args.length-1]);
        //      public static int[] twoSum (int[] nums, int target){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array no " + i + " is " + arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("loop(j)  " + j + " is " + arr[j]);
                if (arr[j] == target - arr[i]) {
                    System.out.println("i =:" +i +"j=:"+j);
                    // return new int[]{i, j};
                }
            }
        }
       // throw new IllegalArgumentException("No two sum solution");
    }
}


