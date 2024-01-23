import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;
    static int[][] DP;
    static int[][] COST;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        DP = new int[n][3];
        COST = new int[n][3];

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            COST[i][RED] = Integer.parseInt(st.nextToken());
            COST[i][GREEN] = Integer.parseInt(st.nextToken());
            COST[i][BLUE] = Integer.parseInt(st.nextToken());
        }

        DP[0][RED] = COST[0][RED];
        DP[0][GREEN] = COST[0][GREEN];
        DP[0][BLUE] = COST[0][BLUE];


        System.out.println(Math.min(paintCost(n - 1, RED),Math.min(paintCost(n - 1, GREEN), paintCost(n - 1,BLUE))));

    }

    static int paintCost(int N, int color){

        if(DP[N][color] == 0){

            if(color == RED){
                DP[N][RED] = Math.min(paintCost(N - 1, GREEN), paintCost(N - 1, BLUE)) + COST[N][RED];
            } else if (color == GREEN) {
                DP[N][GREEN] = Math.min(paintCost(N - 1, RED), paintCost(N - 1, BLUE)) + COST[N][GREEN];
            }else {
                DP[N][BLUE] = Math.min(paintCost(N - 1, GREEN), paintCost(N - 1, RED)) + COST[N][BLUE];
            }

        }

        return DP[N][color];

    }
}