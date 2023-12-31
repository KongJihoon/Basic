import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));


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