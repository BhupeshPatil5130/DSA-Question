import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
           Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] B = new int[n - 1];
            
            for (int i = 0; i < n - 1; i++) {
                B[i] = sc.nextInt();
            }

            Arrays.sort(B);
            
            int[] A = new int[n];
            A[0] = 1;
            A[1] = B[0] - A[0];

            for (int i = 1; i < n - 1; i++) {
                A[i + 1] = B[i] - A[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
        }
	}
}
