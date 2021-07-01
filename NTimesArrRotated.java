package com.datastructure;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

    class NTimesArrRotated
    {
        static int countRotations(int arr[], int low,
                                  int high) {
            // the case when array is not rotated
            if (high < low)
                return 0;
            // If there is only one element left
            if (high == low)
                return low;
            // Find mid
            // /*(low + high)/2;*/
            int mid = low + (high - low) / 2;
// Check if element (mid+1) is minimum
            // element. Consider the cases like
            // {3, 4, 5, 1, 2}
            if (mid < high && arr[mid + 1] < arr[mid])
                return (mid + 1);
            // Check if mid itself is minimum element
            if (mid > low && arr[mid] < arr[mid - 1])
                return mid;
            // Decide whether we need to go to left
            // half or right half
            if (arr[high] > arr[mid])
                return countRotations(arr, low, mid - 1);
            return countRotations(arr, mid + 1, high);
        }

        // Driver program to test above functions
        public static void main (String[] args){
       //     int arr[] = {15, 18, 2, 3, 6, 12};


            Scanner s = new Scanner(System.in); //new instance and calling the input func
            System.out.println("Enter the length of the array:");
            int length = s.nextInt(); //defining size and getting the input
            int[] arr = new int[length]; // defining array of length provided
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < length; i++) {
                arr[i] = s.nextInt();
            }

            System.out.println("The number of times it rotated was :");
  //          int target = s.nextInt();
            int n = arr.length;

            System.out.println(countRotations(arr, 0, n-1));
        }
    }