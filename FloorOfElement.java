package com.datastructure;

import java.util.Scanner;

public class FloorOfElement {
    static int FloorOfElement(int array[], int target) {
        int start = 0;
        int n = array.length;
        int end = n - 1;
        int floor = -1;
        //Iterative binary search
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            //count<<nums[mid]<<"\n";
            if (array[mid] == target)
                return mid;
            else if (array[mid] < target) // move to right
            {
                start = mid + 1;
 //               return array[mid];
            }
            else  {
                floor = array[mid];
                end = mid - 1;
 //               return array[mid];
            }
        }
        return floor;
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
 //       int n = sizeof(array) / sizeof(array[0]);
        int index = FloorOfElement(array, target);

        for (int i = 0; i < length; i++)
        {
            System.out.print("Number " + i + " —> ");
            System.out.println("ceil is " + FloorOfElement(array, )
                    + ", floor is " + FloorOfElement(array, i));
        }
    }
}
