package com.datastructure;

import java.util.Scanner;

public class NextAlphaElement
{

    /* Returns the smallest character from the given
    set of letters that is greater than target */
    static char nextGreatestAlphabet(char[] array,
                                     char target)
    {
        int n = array.length;
        if(target>=array[n-1])
            return array[0];

        int l = 0, r = array.length - 1;

        int ans = -1;
        // Take the first element as l and
        // the rightmost element as r
        while (l <= r)
        {
            // if this while condition does not
            // satisfy simply return the first
            // element.
            int mid = (l + r) / 2;
            if (array[mid] > target)
            {
                r = mid - 1;
                ans = mid;
            }
            else
                l = mid + 1;
        }

        // Return the smallest element
        return array[ans];
    }

    // Driver Code
    public static void main(String[] args)
    {
        /*
        char letters[] = { 'A', 'r', 'z' };
        char K = 'z';
        char result = nextGreatestAlphabet(letters, K);

         */

        // Function call
//          System.out.println(result);
        Scanner sc = new Scanner(System.in);
        System.out.println("First add some characters...");
        char[] array = sc.nextLine().replace(" ", "").toCharArray(); 
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        /*
        System.out.println("\nYou have entered: ");  //for-each loop to print the string
        for(String str: string)
        {
            System.out.println(str);
        }

         */

        System.out.println("Enter the number to search:");
        char target = sc.next().charAt(0);
        System.out.println(target);
        char ans = nextGreatestAlphabet(array,target);

        // Function call
        System.out.println("The next element is " +ans);
    }
}
