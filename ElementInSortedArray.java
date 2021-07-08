package com.datastructure;

import java.util.Scanner;

public class ElementInSortedArray {
    static int CountMinimumElementIndex(int array[], int target) {
        int start = 0;
        int n = array.length;
        int end = n - 1;
        //Iterative binary search
        while(start<=end)
        {
            int mid = (start+end)/2;
            //cout<<nums[mid]<<"\n";
            if(array[mid]==target)
                return mid;
            else if(array[mid]>=array[start]) //check in the left side
            {
                if(target<=array[mid] && target>=array[start])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else
            {
                if(target>=array[mid] && target<=array[end]) //check in the right side
                    start = mid+1;
                else
                    end = mid-1;
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
        int index = CountMinimumElementIndex(array, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");

        }
    }
}



