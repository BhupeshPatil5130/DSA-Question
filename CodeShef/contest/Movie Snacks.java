import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc= new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int Z=sc.nextInt();
        
         int ind = 2 * X + 3 * Y;
        
        
        int offer = 2 * Z + 1 * Y;
        
        System.out.println(Math.min(ind, offer));
	}
}
