import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (n-- > 0) {

            int num = Integer.parseInt(st.nextToken());

            if (isPrime(num)) {
                cnt++;
            }


        }

        br.close();

        System.out.println(cnt);




    }

    static boolean isPrime(int num) {


        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {

            if(num % i == 0) {
                return false;
            }

        }


        return true;
    }






}
