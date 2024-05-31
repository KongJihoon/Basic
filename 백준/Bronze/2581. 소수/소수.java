import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] prime = isPrime(n + 1);

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = m; i <= n; i++) {

            if (!prime[i]) {
                sum += i;

                if(min == Integer.MAX_VALUE) {
                    min = i;
                }

            }
        }

        if (sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }




    }

    static boolean[] isPrime(int num) {


        boolean[] prime = new boolean[num + 1];

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (prime[i]) {
               continue;
            }

            for (int j = i * i; j < num + 1; j= j+i) {
                prime[j] = true;
            }

        }



        return prime;

    }






}
