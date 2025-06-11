
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        sc.close();

        int[] charArray = new int[26];

        Arrays.setAll(charArray, i -> -1);

        for (int i = 0; i < s.length(); i++) {

            if (charArray[s.charAt(i) - 'a'] != -1) {
                continue;
            }
            charArray[s.charAt(i) - 'a'] = i;

        }

        for (int i = 0; i < charArray.length; i++) {

            System.out.print(charArray[i] + " ");
        }


    }




}