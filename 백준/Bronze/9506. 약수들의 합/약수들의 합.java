import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            if(n <= 0){
                break;
            }

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }
            int sum = list.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            if (n == sum) {
                System.out.print(n + " = ");
                for (int i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(list.size() - 1));
            }else {
                System.out.println(n + " is NOT perfect.");
            }
        }

    }
}