import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int q1=sc.nextInt();
        int q2=sc.nextInt();
        int q3=sc.nextInt();
        int q4=sc.nextInt();
        int sum =0;
        if(q1>9) sum++;
        if(q2>9) sum++;
        if(q3>9) sum++;
        if(q4>9) sum++;
        
        System.out.println(sum);
	}
}
