package com.pluralsight.calcengine;

import java.util.Arrays;
import java.util.Scanner;

public class twoSumOptimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //new instance and calling the input func
        System.out.println("Enter the length of the array:");
        int length = s.nextInt(); //defining size and getting the input
        int[] array = new int[length]; // defining array of length provided
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Enter the target:");
        int target = s.nextInt();
//    int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};

//nlog(n) |O(n)
        Arrays.sort(array);
        int end = 0;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == target) {
                System.out.println("Output has been found " + array[left] + array[right]);
                left++; //finds all left values
                right--; //finds all right values
            } else if (currentSum < target) {
                left++;
            }
            else if (currentSum > target){
                right--;}
            else {
                System.out.println("Not found");
            }

        }
    }
}
