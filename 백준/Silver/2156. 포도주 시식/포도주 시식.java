import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    static final int MOD = 10007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] cost = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            cost[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = cost[1];
        if(n > 1){
            dp[2] = cost[1] + cost[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1],Math.max(dp[i - 2] + cost[i], dp[i - 3] + cost[i - 1] + cost[i]));
        }

        System.out.println(dp[n]);

    }
}