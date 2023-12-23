import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static final int Max = 1000001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isPrime = new boolean[Max];

        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i < Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) continue;

            for (int j = i * i; j < isPrime.length; j += i) {
                isPrime[j] = true;
            }
        }

        int n = Integer.parseInt(br.readLine());
        while (n != 0){
            boolean answer = false;

            for (int i = 2; i < n; i++) {
                if (!isPrime[i] && !isPrime[n - i]){
                    System.out.println(n + " = " + i + " + " + (n - i));
                    answer = true;
                    break;
                }
            }

            if(!answer){
                System.out.println("Goldbach's conjecture is wrong");
            }

            n = Integer.parseInt(br.readLine());

        }

    }
}