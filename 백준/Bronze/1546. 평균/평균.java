
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());


        double sum = 0;

        double max = Double.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            double num = Double.parseDouble(st.nextToken());


            if (num > max) {
                max = num;
            }

            sum += num;


        }







        System.out.println(((sum / max) * 100) / n);














    }




}