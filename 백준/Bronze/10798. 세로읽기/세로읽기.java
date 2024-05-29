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

        char[][] nums = chars();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums[0].length; i++) {

            for (int j = 0; j < 5; j++) {
                if (nums[j][i] == '\0') continue;
                sb.append(nums[j][i]);
            }
        }

        System.out.println(sb);

    }

    public static char[][] chars() {

        char[][] chars = new char[5][15];



        for (int i = 0; i < chars.length; i++) {
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                chars[i][j] = s.charAt(j);
            }

        }
        return chars;
    }




}
