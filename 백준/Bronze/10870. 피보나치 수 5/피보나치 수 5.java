import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(sb.readLine());
        System.out.println(recursion(n));
    }
    public static long recursion(long n){
        if(n == 0)return 0;
        if(n == 1)return 1;

        return recursion(n - 1) + recursion(n - 2);
    }

}