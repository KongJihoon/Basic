import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        String tmp1 = Integer.toString(A) + Integer.toString(B);
        String tmp2 = Integer.toString(C) + Integer.toString(D);

        long answer = Long.parseLong(tmp1) + Long.parseLong(tmp2);

        System.out.println(answer);

    }
}