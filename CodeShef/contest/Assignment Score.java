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
            int N = sc.nextInt();
            
            int Sum = 0;
            for (int i = 0; i < N; i++) {
                Sum += sc.nextInt();
            }
            int requiredTotal = (int) Math.ceil(0.5 * 100 * (N + 1));
            int minScore = requiredTotal - Sum;
            System.out.println(minScore > 100 ? -1 : Math.max(0, minScore));
        }
	}
}
