
import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        Arrays.setAll(arr, i -> Integer.parseInt(st.nextToken()));

        int v = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == v) {
                cnt++;
            }

        }

        System.out.println(cnt);

    }



}