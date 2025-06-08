
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        while (m-- > 0) {

            st = new StringTokenizer(br.readLine(), " ");

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());


            for (int l = i - 1; l < j; l++) {

                arr[l] = k;

            }

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }








    }



}