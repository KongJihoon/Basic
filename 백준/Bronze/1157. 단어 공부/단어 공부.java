import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();

        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'A';
            cnt[n]++;
        }
        int max = Integer.MIN_VALUE;
        char answer = '?';
        for (int i = 0; i < cnt.length; i++) {
            if(max < cnt[i]){
                max = cnt[i];
                answer = (char) (i + 'A');
            } else if (max == cnt[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);

    }
}
