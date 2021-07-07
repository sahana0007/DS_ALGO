package com.datastructure;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class NTimesArrRotated
{
    static int CountMinimumElementIndex(int array[]){
        int left = 0;
        int n = array.length;
        int right = n - 1;
    while(left<=right){
    if(array[left]<=array[right]){return left; } //Case 1:already sorted

    int mid = (left + (right - left) / 2);

    int next = (mid + 1)%array.length;
    int previous = (mid -1 +array.length)%array.length;

    if(array[mid]<=array[next] && array[mid] <= array[previous]) //case 2 ie mid sandwitched
    {return mid;}

    //if array[mid..right] is sorted and mid is not the min element, so discard and search in left
    if(array[mid]>=array[left]){
            left = mid +1;
    }
    if (array[mid]<=array[right]){
        right = mid -1; }
        }
    return -1;
    }

    public static void main (String[] args){
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

        System.out.println("The array is rotated " + CountMinimumElementIndex(array) + " times");
    }

}
