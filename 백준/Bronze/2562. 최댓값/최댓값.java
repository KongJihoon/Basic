
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringBuilder sb = new StringBuilder();


        int[] arr = new int[9];

        int idx = 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                idx = i;

                max = arr[i];
            }

        }

        sb.append(arr[idx]).append("\n").append(idx + 1);

        System.out.println(sb);






    }



}