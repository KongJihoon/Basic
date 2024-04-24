import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;        

        st = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++) {
         
            int value = Integer.parseInt(st.nextToken());
            
            if(max < value) {
                max = value;
            }
            
            if(min > value) {
                min = value;
            }
            
        }

        System.out.println(min + " " + max);


    }

}
