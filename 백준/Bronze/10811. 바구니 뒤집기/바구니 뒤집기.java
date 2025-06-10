
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = IntStream.range(1, n + 1).toArray();

        while (m-- > 0) {

            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());

            int j = Integer.parseInt(st.nextToken());


            swap(arr, i - 1, j - 1);


        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }







    }

    public static void swap(int[] arr, int i, int j) {

        if (i >= j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        swap(arr, i + 1, j - 1);

    }


}