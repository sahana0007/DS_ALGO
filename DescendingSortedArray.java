package com.datastructure;

// descending binary search in sorted array
import java.util.Arrays;
import java.util.Scanner;

public class DescendingSortedArray {
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
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (target == array[mid]) {
                System.out.println("Your target is reached and the position is " + mid);
                break;
            } else if (target <= array[mid]) {
                start = mid + 1;
            } else if (target >= array[mid]) {
                end = mid - 1;
            } else {
                System.out.println("Element not found");
            }
        }

    }
}




