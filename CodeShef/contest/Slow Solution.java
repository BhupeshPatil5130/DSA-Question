import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] inputs = br.readLine().split(" ");
            int maxT = Integer.parseInt(inputs[0]);
            int maxN = Integer.parseInt(inputs[1]);
            int sumN = Integer.parseInt(inputs[2]);
            long maxIterations = 0;
            int remainingSumN = sumN;
            int casesUsed = Math.min(maxT, sumN / maxN);
            for (int i = 0; i < casesUsed; i++) {
                maxIterations += (long) maxN * maxN;
                remainingSumN -= maxN;
            }
            if (remainingSumN > 0) {
                maxIterations += (long) remainingSumN * remainingSumN;
            }
            sb.append(maxIterations).append("\n");
        }
        System.out.print(sb);
    }
}
