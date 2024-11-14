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
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            int minSlices = N * 10;
            int maxSlices = N * 12;
            
            if (K >= minSlices && K <= maxSlices) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}
}
