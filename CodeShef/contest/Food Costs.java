import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner scanner = new Scanner(System.in);
        int dailyCost = scanner.nextInt();
        int sundayCost = scanner.nextInt();
        int weeklyExpense = 6 * dailyCost + sundayCost;
        System.out.println(weeklyExpense);
	}
}
