package com.datastructure;

import java.util.Scanner;


public class SearchElementBitonicArray {
    public static int ascendingBinarySearch(int array[], int low, int high, int target)
    {
        while (low <= high)
            {
                int mid = low + (high - low) / 2;
                if (array[mid] == target)
                {
                    return mid;
                }
                if (array[mid] > target)
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            return -1;
        }

    static int descendingBinarySearch(int array[], int low, int high, int target)
    {
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (array[mid] == target)
            {
                return mid;
            }
            if (array[mid] < target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int findBitonicPoint(int array[],
                                int n,
                                int start,
                                int end)
    {
        int mid;
        int bitonicPoint = 0;
        mid = (end + start) / 2;
        if (array[mid] > array[mid - 1]
                && array[mid] > array[mid + 1])
        {
            return mid;
        }
        else {
            if (array[mid] > array[mid - 1]
                    && array[mid] < array[mid + 1])
            {
                bitonicPoint = findBitonicPoint(array, n, mid, end);
            }
            else {
                if (array[mid] < array[mid - 1]
                        && array[mid] > array[mid + 1])
                {
                    bitonicPoint = findBitonicPoint(array, n, start, mid);
                }
            }
        }
        return bitonicPoint;
    }

    static int searchBitonic(int array[], int n,
                             int target, int index)
    {
        if (target > array[index])
        {
            return -1;
        }
        else if (target == array[index])
        {
            return index;
        }
        else {
            int temp = ascendingBinarySearch(
                    array, 0, index - 1, target);
            if (temp != -1)
            {
                return temp;
            }

            // Search in right of k
            return descendingBinarySearch(array, index + 1,
                    n - 1, target);
        }
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
        //          int target = s.nextInt();
        int n = array.length;
        System.out.println("Enter the number to search:");
        int target = s.nextInt();

          int start = 0;
           int end = n - 1;
            int index;
            index = findBitonicPoint(array, n, start, end);

            int x = searchBitonic(array, n, target, index);

            if (x == -1) {
                System.out.println("Element Not Found");
            }
            else {
                System.out.println("Element Found at index "
                        + x);
            }
        }
    }

