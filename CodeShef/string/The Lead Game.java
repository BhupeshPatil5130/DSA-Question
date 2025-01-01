import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int player1 = 0; 
        int player2 = 0; 
        int maxLead = 0;           
        int winner = 0;            

        for (int i = 0; i < n; i++) {
            int s1 = sc.nextInt(); 
            int s2 = sc.nextInt();


            player1 += s1;
            player2 += s2;

            int lead = Math.abs(player1 - player2);
            int leader = (player1 > player2) ? 1 : 2;

          
            if (lead > maxLead) {
                maxLead = lead;
                winner = leader;
            }
        }


        System.out.println(winner + " " + maxLead);
	}
}
