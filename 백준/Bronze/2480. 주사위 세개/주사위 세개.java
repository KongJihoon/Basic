import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int reseult = 0;
        if(A == B && B == C){
            reseult = 10000 + A * 1000;
            System.out.println(reseult);
        } else if (A == B && A != C || A == C && A != B) {
            reseult = 1000 + A * 100;
            System.out.println(reseult);
        } else if (B == C && B != A) {
            reseult = 1000 + B * 100;
            System.out.println(reseult);
        }else {
            int max = A;
            if(max < B) max = B;
            if(max < C) max = C;
            System.out.println(max * 100);
            
        }


    }
}