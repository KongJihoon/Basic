import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(alphabet[c - 'a'] != -1){
                continue;
            }
            alphabet[c - 'a'] = i;
        }

        for (int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[i]).append(" ");
        }
        System.out.println(sb);

    }
}
