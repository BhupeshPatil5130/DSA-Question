//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
       int n = arr.length;
        int maxP = arr[0], curMax = arr[0], curMin = arr[0];

        for (int i = 1; i < n; i++) {
            int temp = curMax;
            curMax = Math.max(arr[i], Math.max(curMax * arr[i], curMin * arr[i]));
            curMin = Math.min(arr[i], Math.min(temp * arr[i], curMin * arr[i]));
            maxP = Math.max(maxP, curMax);
        }
        return maxP;
    }
}