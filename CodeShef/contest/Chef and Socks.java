import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
          Scanner sc = new Scanner(System.in);
        
        
        int A = sc.nextInt();
        int X = sc.nextInt(); 
        int Y = sc.nextInt(); 
        
       
        int totalMoney = X + Y;
        
      
        if (totalMoney >= A) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	}
}
