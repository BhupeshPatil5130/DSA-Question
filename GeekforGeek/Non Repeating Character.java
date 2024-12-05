//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code 
        int[] charIndex = new int[26];
        Arrays.fill(charIndex, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndex[c - 'a'] == -1) {
                charIndex[c - 'a'] = i;
            } else {
                charIndex[c - 'a'] = -2;
            }
        }

        int firstNonRepeatingIndex = Integer.MAX_VALUE;
        for (int index : charIndex) {
            if (index >= 0) {
                firstNonRepeatingIndex = Math.min(firstNonRepeatingIndex, index);
            }
        }

        return firstNonRepeatingIndex == Integer.MAX_VALUE ? '$' : s.charAt(firstNonRepeatingIndex);
    }
}
