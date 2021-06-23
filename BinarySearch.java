package com.datastructure;

//binary search in sorted array
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
//    int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};

//nlog(n) |O(n)
        Arrays.sort(array);
        //     int end = 0;
        int start = 0;
        int end = array.length - 1;
        while (array[start] < array[end]) {
 //           int mid = array[start] +(array[end]-array[start])/2;
            int mid = (start + (end-start)/2);
            if (array[mid] == target) {
                System.out.println("Search found " +array[mid] +" mid " +mid);
                break;
            } else if (array[mid] < target) {
                start = mid +1;
            }
            else if (array[mid] > target){
                end = mid -1;
            }
            else {
                System.out.println("Not found");
            }
 //          int mid = (start + end)/2;
        }
    }
}