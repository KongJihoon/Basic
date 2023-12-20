import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long count2 = two_power_n(n) - two_power_n(n - m) - two_power_n(m);
        long count5 = five_power_n(n) - five_power_n(n - m) - five_power_n(m);


        System.out.println(Math.min(count2,count5));




    }

    public static long five_power_n(long num){
        int cnt = 0;

        while (num >= 5){
            cnt += (num / 5);
            num /= 5;

        }
        return cnt;
    }

    public static long two_power_n(long num){
        int cnt = 0;

        while (num >= 2){
            cnt += (num / 2);
            num /= 2;
        }
        return cnt;
    }


}