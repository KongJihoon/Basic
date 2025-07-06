
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int b = Integer.parseInt(st.nextToken());

        String result = "";

        while (n > 0) {

            int tmp = n % b;

            if (tmp >= 10) {

                result += (char)(tmp + 55);

            } else {
                result += tmp;
            }

            n /= b;

        }

        for (int i = result.length() - 1; i >= 0; i--) {

            System.out.print(result.charAt(i));
        }


    }

}

