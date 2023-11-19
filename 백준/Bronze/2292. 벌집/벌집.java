import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int idx = 2;
        int cnt = 1;
        if(n == 1){
            System.out.println(1);
        }else {
            while (idx <= n){
                idx = idx + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }

        

    }
}