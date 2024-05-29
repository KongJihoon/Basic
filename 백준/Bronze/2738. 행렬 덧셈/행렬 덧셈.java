import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {




        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];


        A = score(n, m);
        B = score(n, m);

        int[][] sum = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int[][] score(int n, int m) {

        int[][] num = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                 num[i][j] = sc.nextInt();
            }

        }
        return num;
    }




}
