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
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }
        int max = 0;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < i; j++) {
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }

            max = Math.max(dp[i], max);
        }

        System.out.println(max);

    }
}