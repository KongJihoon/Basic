import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num = 2;

        while (true) {

            if(N == 1 || N == 0) {
                break;
            }

            while (N % num == 0) {

                N = N / num;
                System.out.println(num);
            }

            num++;

        }






    }







}
