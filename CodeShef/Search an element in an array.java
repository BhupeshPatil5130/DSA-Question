import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
        int count=0;
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        for(int i=0;i<n;i++){
            if(num==arr[i]){
                count++;
                break;
            }
        }
        
        if(count==1)
            System.out.println("YES");
        else
            System.out.println("NO");
        
	}
}