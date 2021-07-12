package com.datastructure;

import java.util.Scanner;

public class SearchInNearlySortedArray {

    static int SearchInNearlySortedArray(int array[], int target) {
        int start = 0;
        int n = array.length;
        int end = n - 1;
        //Iterative binary search
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            //count<<nums[mid]<<"\n";
            if (array[mid] == target)
                return mid;
            else if (mid - 1 >= start && array[mid - 1] == target) //to avoid error if mid comes to start
                return mid - 1;
            else if (mid + 1 <= end && array[mid + 1] == target)
                return mid + 1;
            else if (array[mid] < target) {
                start = mid + 2;
            } else if (array[mid] > target) {
                end = mid - 2;
            } else {
                System.out.println("Not found ");
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //     int arr[] = {15, 18, 2, 3, 6, 12};

        Scanner s = new Scanner(System.in); //new instance and calling the input func
        System.out.println("Enter the length of the array:");
        int length = s.nextInt(); //defining size and getting the input
        int[] array = new int[length]; // defining array of length provided
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = s.nextInt();
        }
        //          int target = s.nextInt();
        int n = array.length;
        System.out.println("Enter the number to search:");
        int target = s.nextInt();

        int index = SearchInNearlySortedArray(array, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
