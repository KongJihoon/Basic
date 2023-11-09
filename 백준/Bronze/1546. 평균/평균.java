import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] score = new double[N];
        double max = 0;
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,score[i]);
        }
        double sum = 0;
        for (int i = 0; i < N; i++) {
            score[i] = (score[i] / max) * 100;

            sum += score[i];
        }

        System.out.println(sum/N);

    }

}
