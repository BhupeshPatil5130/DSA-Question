import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
		int term= sc.nextInt();
		for(int i=0;i<term;i++){
		    
		    int num= sc.nextInt();
		    int B[] = new int[num];
		    
		   int count =0;
		    for (int j=0;j<num;j++){
		        B[j]=sc.nextInt();
		        if(B[j]>=1000){
		            count++;
		        }
		    }
		  	System.out.println(count);  
		}

	}
}
