import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Main {




    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {

            String[] s = br.readLine().split(" ");

            for (String str: s) {

                StringBuilder sb = new StringBuilder(str);

                System.out.print(sb.reverse() + " ");
            }
            System.out.println();

        }

    }


}


