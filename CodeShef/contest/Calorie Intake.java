import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereINt
		Scanner sc=new Scanner(System.in);;
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
            int a=(y*z);
            if(a>x){
                System.out.println(-1);
                
            }else{
                System.out.println(x-a);
            }
	}
}
