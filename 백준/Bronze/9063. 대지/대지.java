import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                x[i] = Integer.parseInt(st.nextToken());
                y[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println((x[x.length - 1] - x[0]) * (y[y.length - 1] - y[0]));



    }
}