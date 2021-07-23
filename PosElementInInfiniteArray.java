package com.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class PosElementInInfiniteArray {

        static int PosElementInInfiniteArray(int array[], int target, int start, int end) {
            if (start >= end) {
                int mid = (start + (end - start) / 2);
                if (array[mid] == target)
                    return mid;
                if (array[mid] > target)
                    return PosElementInInfiniteArray(array, target, end, mid - 1);
                return PosElementInInfiniteArray(array, target, mid + 1, end);
            }
            return -1;
        }


    static int SearchElement(int array[],int target){
            int start = 0;
            int n = array.length;
            int end = 1;
            int val = array[0];
            //Iterative binary search
            while (val < target) {
                    start = end;     // store previous high
                    //check that 2*h doesn't exceeds array
                    //length to prevent ArrayOutOfBoundException
                    if(2*end < n-1)
                        end = 2*end;
                    else
                        end = n-1;

                    val = array[end]; // update new val
                return PosElementInInfiniteArray(array,target,start, end);
                }

                // at this point we have updated low
                // and high indices, thus use binary
                // search between them
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

            int index = SearchElement(array, target);
            if (index != -1) {
                System.out.println("Element found at index " + index);
            } else {
                System.out.println("Element not found in the array");
//        System.out.println("Floor is " + FloorOfElement(array, target));
            }
        }
    }