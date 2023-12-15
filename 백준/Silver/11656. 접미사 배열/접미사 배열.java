import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] tmp = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            tmp[i] = str.substring(i,tmp.length);
        }
        Arrays.sort(tmp);

        for (String item : tmp){
            System.out.println(item);
        }

    }
}
