import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static final long MOD = 1_000_000_000;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {

            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);

            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}