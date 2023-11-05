
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i,a,b,(a+b));
            
        }


    }
}