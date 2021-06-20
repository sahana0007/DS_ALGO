package com.pluralsight.calcengine;


//check if the complement exists in the array

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//    int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};

public class twoSumHash {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //new instance and calling the input func
        System.out.println("Enter the length of the array:");
        int length = s.nextInt(); //defining size and getting the input
        int[] array = new int[length]; // defining array of length provided
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Enter the target:");
        int target = s.nextInt();

        Set<Integer> nums = new HashSet<Integer>();
        for(int i = 0; i<array.length; i++){
 //           int secondNum = array[i];
            int potentialMatch = target - i;
            System.out.println("potentialMatch = " +potentialMatch + " i = " +i);
            System.out.println("nums =" +nums);
            if(nums.contains(potentialMatch)){
                System.out.println("Result Found : potential Match =:" + potentialMatch + " i=:" + i);
            }
            else {
                nums.add(i);
            }
        }
    }
}