import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                for (int j = 0; j < a; j++) {
                    sb.append(c);
                }

            }

            sb.append("\n");

        }

        System.out.println(sb);


    }

}
