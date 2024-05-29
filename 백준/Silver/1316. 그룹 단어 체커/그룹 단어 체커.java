import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int cnt = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                cnt++;
            }
        }

        System.out.println(cnt);


    }

    public static boolean check() {

        boolean[] check = new boolean[26];
        int prev = 0;

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {

            int now = s.charAt(i);

            if (prev != now) {

                if(check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }

            } else {
                continue;
            }


        }



        return true;
    }



}
