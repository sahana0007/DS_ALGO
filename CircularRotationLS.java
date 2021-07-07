package com.datastructure;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class CircularRotationLS{
    static int CountMinimumElementIndex(int array[], int n){
        int result = -1;
        int first =array[0];

        for(int i = 0; i < array.length-1; i++){
            if(array[i] < first) //5<2
            {
                first = array[i];
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //new instance and calling the input func
        System.out.println("Enter the length of the array:");
        int length = s.nextInt(); //defining size and getting the input
        int[] array = new int[length]; // defining array of length provided
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = s.nextInt();
        }
        //    System.out.println("The number of times it rotated was :");
        //          int target = s.nextInt();
        int n = array.length;
        System.out.println("The number of times it rotated was :" +CountMinimumElementIndex(array, n));
    }
}
