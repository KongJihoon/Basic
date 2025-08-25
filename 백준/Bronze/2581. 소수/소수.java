import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int m = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());

        prime = new boolean[n + 1];
        getPrime();

        int sum = 0;

        int min = Integer.MAX_VALUE;
        for (int i = m; i <= n; i++) {

            if (!prime[i]) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }

            }

        }

        if (sum == 0) {
            System.out.println(-1);
        } else {

            System.out.println(sum);
            System.out.println(min);
            
        }


    }


    static void getPrime() {

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length) ; i++) {

            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j+=i) {

                prime[j] = true;
            }
        }

    }
}
