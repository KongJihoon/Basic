import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        char[][] c = new char[5][15];
        for (int i = 0; i < c.length; i++) {
            String s = br.readLine();
            if(max < s.length()){
                max = s.length();
            }
            for (int j = 0; j < s.length(); j++) {
                c[i][j] = s.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(c[j][i] == '\0'){
                   continue;
                }
                sb.append(c[j][i]);
            }
        }
        System.out.println(sb.toString());


    }
}