import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()){

            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if(num == 1){
                continue;
            }

            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                cnt++;
            }


        }
        System.out.println(cnt);
    }
}