import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    static final int MOD = 10007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());

            int[][] cost = new int[2][n + 1];
            int[][] dp = new int[2][n + 1];


            for (int j = 0; j < 2 ; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= n ; k++) {
                    cost[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][1] = cost[0][1];
            dp[1][1] = cost[1][1];

            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + cost[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + cost[1][j];

            }
            sb.append(Math.max(dp[0][n],dp[1][n])).append("\n");


        }
        System.out.println(sb);


    }
}