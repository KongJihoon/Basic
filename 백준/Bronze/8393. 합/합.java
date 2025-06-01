
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = sum(n);

        System.out.println(sum);
    }

    public static int sum(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);

    }

}