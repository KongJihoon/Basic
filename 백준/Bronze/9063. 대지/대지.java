import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int prev_x = Integer.parseInt(st.nextToken());
        int prev_y = Integer.parseInt(st.nextToken());

        int min_value_x = prev_x;
        int max_value_x = prev_x;

        int min_value_y = prev_y;
        int max_value_y = prev_y;

        while (n-- > 1) {

            st = new StringTokenizer(br.readLine(), " ");

            int now_x = Integer.parseInt(st.nextToken());
            int now_y = Integer.parseInt(st.nextToken());

            max_value_x = Math.max(max_value_x, now_x);
            min_value_x = Math.min(min_value_x, now_x);

            max_value_y = Math.max(max_value_y, now_y);
            min_value_y = Math.min(min_value_y, now_y);
        }


        int result_x = max_value_x - min_value_x;
        int result_y = max_value_y - min_value_y;

        System.out.println(result_x * result_y);






    }







}
