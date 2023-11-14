import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int reversedA = reverse(a);
        int reversedB = reverse(b);
        System.out.println(reversedA > reversedB ? reversedA : reversedB);

    }

    public static int reverse(int num){
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder(str).reverse();
        int reversed = Integer.parseInt(sb.toString());

        return reversed;
    }
}