package com.datastructure;

import java.util.Scanner;

public class FirstOccuranceBS {
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
        int result = -1;

        //firstOccurance
        while (start<=end) {
            int mid = (start + (end - start) / 2);
            if (target == array[mid]) {
                result = mid;
                end = mid - 1;
 //              break;
        }
            else if (target<=array[mid])
            {
                end = mid -1;
            }
            else {start = mid +1;
            }
        }
        System.out.println("Result found " +result);
    }
}
