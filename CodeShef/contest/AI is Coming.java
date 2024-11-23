import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the difficulty level of the assignment
        int X = scanner.nextInt();
        
        // Check if the difficulty is less than or equal to 60
        if (X <= 60) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
