package com.datastructure;

import java.util.Scanner;

public class PeakElement {
    public static int PeakElement(int[] array) {
        // search space is `array[start…end]`
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid>0 && mid<array.length - 1){
                if(array[mid] > array[mid-1] && array[mid] >array[mid+1])
                    return mid;
                else if(array[mid -1]>array[mid]){  //else if(array[mid]>array[mid+1])
                    end = mid -1;}
                    else
                {start = mid +1;}
                }
            else if (mid ==0){
                if(array[0]> array[1]){
                    return 0;
                }
                else return 1;
            }
            else if(mid == (array.length -1))
            {
                if ((array.length -1)>(array.length -2)){
                    return (array.length -1);
                }
                else return (array.length -2);
            }

        }
        // `target` doesn't exist in the array
        return -1;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //new instance and calling the input func
        System.out.println("Enter the length of the array:");
        int length = s.nextInt(); //defining size and getting the input
        int[] array = new int[length]; // defining array of length provided
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = s.nextInt();
        }
 //       System.out.println("Enter the number to search:");
  //      int target = s.nextInt();
        int index = PeakElement(array);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

}
