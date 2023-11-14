import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        String answer;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            answer = "";
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < p; k++) {
                    answer += s.charAt(j);
                }
            }
            System.out.println(answer);
        }

    }
}
