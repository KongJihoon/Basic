
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());



        int range = 2;

        int cnt = 1;



        if (n == 1) {
            cnt = 1;
        } else {

            while (range <= n) {

                range = range + (6 * cnt);
                cnt++;
            }

        }

        System.out.println(cnt);

    }

}

