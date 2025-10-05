import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static StringBuilder sb;

    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        String solution = solution(n);

        System.out.println(cnt);
        System.out.println(solution);


    }

    public static String solution(int n) {

        sb = new StringBuilder();

        hanoi(n, 1, 2,3);

        return sb.toString();

    }

    public static void hanoi(int n, int start, int mid, int to) {

        if (n == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            cnt++;
            return;
        }

        hanoi(n - 1, start, to, mid);

        sb.append(start).append(" ").append(to).append("\n");
        cnt++;

        hanoi(n - 1, mid, start, to);

    }










}
