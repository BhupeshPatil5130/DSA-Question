import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int testCount = sc.nextInt();
        
        while (testCount-- > 0) {
            int length = sc.nextInt();
            int targetSum = sc.nextInt();
            
            if (length % 2 == 0) {
                if (targetSum == length / 2) {
                    result.append("YES\n");
                } else {
                    result.append("NO\n");
                }
            } else {
                if (targetSum == length / 2 || targetSum == (length / 2) + 1) {
                    result.append("YES\n");
                } else {
                    result.append("NO\n");
                }
            }
        }
        
        System.out.print(result);
        
	}
}
