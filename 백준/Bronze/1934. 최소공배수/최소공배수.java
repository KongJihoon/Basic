import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        while (n > 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(lcm(a,b)).append("\n");
            n--;
        }

        System.out.println(sb);

    }

    public static int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }else {
            return gcd(b, a % b);
        }
    }

    public static int lcm (int a, int b){
        return a * b / gcd(a, b);
    }

}