package com.datastructure;

import java.util.Scanner;

public class AgnosticBS {

    public static void main(String[] args) {
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
        
        int start = 0;
        int end = array.length - 1;

        /*
        int ascending = 0;
       if (array[start] < array[end]){
            int ascending = 1;
        }
         */

        while(start<=end)
        {
            int mid = (start + (end-start)/2);
            if (array[mid] == target) {
                System.out.println("Search found " +array[mid] +" mid " +mid);
                break;}
            if(array[start] < array[end]) //ie aschending arr[0] <arr[1]
            {
                if (array[mid] < target) {
                    start = mid +1;
                }
                else if (array[mid] > target){
                    end = mid -1;
                }
                else {
                    System.out.println("Not found");
                }
            }
            else
            {
                 if (target <= array[mid]) {
                    start = mid + 1;
                } else if (target >= array[mid]) {
                    end = mid - 1;
                } else {
                    System.out.println("Element not found");
                }
            }
        }

    }
}
