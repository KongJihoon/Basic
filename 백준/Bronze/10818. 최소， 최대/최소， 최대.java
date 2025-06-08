
import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());


        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);

        }

        System.out.println(min + " " + max);






    }



}