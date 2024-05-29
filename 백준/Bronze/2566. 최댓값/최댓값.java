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

        int[][] nums = score();

        int max = Integer.MIN_VALUE;
        int n = 0;
        int m = 0;

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                if (max < nums[i][j]) {
                   max = nums[i][j];
                   n = i;
                   m = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((n+1) + " " + (m + 1));


    }

    public static int[][] score() {

        int[][] num = new int[9][9];

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                 num[i][j] = sc.nextInt();
            }

        }
        return num;
    }




}
