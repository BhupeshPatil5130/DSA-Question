import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
             
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            
            int[] B = new int[m];
            for (int i = 0; i < m; i++) {
                B[i] = sc.nextInt();
            }
             
            int sad = 0;
            for (int i = 0; i < m; i++) {
                int one = B[i] - 1;
                if (one >= 0 && one < n && A[one] > 0) { 
                    A[one]--;
                } else {
                    sad++;
                }
            }
            System.out.println(sad);
        }
  
    }
}
