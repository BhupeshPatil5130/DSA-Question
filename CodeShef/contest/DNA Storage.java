import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        while (testCases-- > 0) {
            int length = input.nextInt();
            String binaryString = input.next();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < length; i += 2) {
                String pair = binaryString.substring(i, i + 2);

                if (pair.equals("00")) {
                    result.append("A");
                } else if (pair.equals("01")) {
                    result.append("T");
                } else if (pair.equals("10")) {
                    result.append("C");
                } else if (pair.equals("11")) {
                    result.append("G");
                }
            }

            System.out.println(result.toString());
        }
    }
}
