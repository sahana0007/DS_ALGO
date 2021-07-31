package com.datastructure;

import java.util.Scanner;

public class MinDifferenceInSortedArray {
    public static int binarySearch(int[] array, int target) {
        // search space is `array[start…end]`
        int start = 0, end = array.length - 1;


        // loop till the search space is exhausted
        while (start <= end) {
            // find the mid-value in the search space and
            // compares it with the target

 //           int mid = (start + end) / 2;

            // overflow can happen. Use:
            // int mid = start + (end - start) / 2;
            // int mid = end - (end - start) / 2;
            // key is found
            for (int i = 0; i <= array.length; i++) {
                int mid = (start + end) / 2;
                if (target == array[mid]) {
                    return array[mid];
                }

                // discard all elements in the end search space,
                // including the middle element
                else if (target < array[mid]) {
                    end = mid - 1;
                }

                // discard all elements in the start search space,
                // including the middle element
                else {
                    start = mid + 1;
                }
            }
            // `target` doesn't exist in the array
            // return -1;

            if (Math.abs(array[end] - target) > Math.abs(array[start] - target))
                return array[start];
            else {
                return array[end];
            }
        }
        return -1;
    }


        public static void main (String[]args){
            Scanner s = new Scanner(System.in); //new instance and calling the input func
            System.out.println("Enter the length of the array:");
            int length = s.nextInt(); //defining size and getting the input
            int[] array = new int[length]; // defining array of length provided
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < length; i++) {
                array[i] = s.nextInt();
            }
            System.out.println("Enter the number to search:");
            int target = s.nextInt();
            int index = binarySearch(array, target);

            if (index != -1) {
                System.out.println("Element found at index " + index);
            } else {
                System.out.println("Element not found in the array");
            }
        }
    }
