import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    static final long MOD = 1_000_000_000;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[n + 1][10];

        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1L;
        }

        for (int i = 2; i <= n ; i++) {
            dp[i][0] = dp[i - 1][1] % MOD;

            for (int j = 1; j <= 9 ; j++) {
                if(j == 9){
                    dp[i][9] = dp[i - 1][8] % MOD;
                }else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
                }
            }
        }


        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result = (result + dp[n][i]) % MOD;
        }

        System.out.println(result);



    }
}