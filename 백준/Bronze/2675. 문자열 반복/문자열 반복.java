
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while (n-- > 0) {


            StringTokenizer st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();


            for (char c : s.toCharArray()) {

                for (int i = 0; i < r; i++) {

                    sb.append(c);

                }

            }

            sb.append("\n");

        }

        System.out.println(sb);



        

    }




}