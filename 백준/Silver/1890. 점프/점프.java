import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long [][] dp = new long[N + 1][N + 1];

        int[][] board = new int[N + 1][N + 1];
        StringTokenizer st;
        for (int i = 1; i <= N ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[1][1] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int next = board[i][j];
                if(next == 0){
                    break;
                }

                if(j + next <= N){
                    dp[i][j + next] += dp[i][j];
                }
                if(i + next <= N){
                    dp[i + next][j] += dp[i][j];
                }

            }
        }
        System.out.println(dp[N][N]);

    }
}