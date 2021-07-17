package com.datastructure;

    public class NextAlphaElement
    {

        /* Returns the smallest character from the given
        set of letters that is greater than K */
        static char nextGreatestAlphabet(char alphabets[],
                                         char K)
        {
            int n = alphabets.length;
            if(K>=alphabets[n-1])
                return alphabets[0];

            int l = 0, r = alphabets.length - 1;

            int ans = -1;
            // Take the first element as l and
            // the rightmost element as r
            while (l <= r)
            {
                // if this while condition does not
                // satisfy simply return the first
                // element.
                int mid = (l + r) / 2;
                if (alphabets[mid] > K)
                {
                    r = mid - 1;
                    ans = mid;
                }
                else
                    l = mid + 1;
            }

            // Return the smallest element
            return alphabets[ans];
        }

        // Driver Code
        public static void main(String[] args)
        {
            char letters[] = { 'A', 'r', 'z' };
            char K = 'z';
            char result = nextGreatestAlphabet(letters, K);

            // Function call
            System.out.println(result);
        }
    }

