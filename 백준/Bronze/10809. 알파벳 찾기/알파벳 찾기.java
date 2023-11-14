import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
        's','t','u','v','w','x','y','z'};
        int[] n = new int[c.length];
        Arrays.fill(n, -1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if(c[j] == s.charAt(i)){
                    if(n[j] != -1){
                        continue;
                    }
                    n[j] = i;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();



    }
}