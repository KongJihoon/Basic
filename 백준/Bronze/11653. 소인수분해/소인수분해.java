import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(N) ; i++) {
            while (N % i == 0){
                sb.append(i).append("\n");
                N /= i;
            }
        }

        if(N != 1){
            sb.append(N);
        }

        System.out.println(sb);

    }
}