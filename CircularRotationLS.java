package com.datastructure;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class CircularRotationLS {
    static int countRotations(int array[], int n) {
        int min = array[0];
        int min_index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] < min){
                min = array[i];
                min_index = i;
 //               System.out.println("The number of times it rotated was :" +min_index); why is this not coming?
            }
        }
        return min_index;
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

    //    System.out.println("The number of times it rotated was :");
        //          int target = s.nextInt();
        int n = array.length;
        System.out.println("The number of times it rotated was :" +countRotations(array, n));

    }
}



