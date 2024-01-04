import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = new boolean[1000001];

        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i <= (int) Math.sqrt(isPrime.length); i++) {
            for (int j = 2; i * j < isPrime.length ; j++) {
                isPrime[i * j] = true;
            }
        }

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0){
            int tmp = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int i = 2; i <= tmp / 2; i++) {
                if(!isPrime[i] && !isPrime[tmp - i]){
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}