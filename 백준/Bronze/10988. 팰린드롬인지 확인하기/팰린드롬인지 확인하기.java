import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int pelindrom(String s) {

        for (int i = 0; i < s.length() / 2; i++) {

            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return 0;
            }

        }
        return 1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();


        System.out.println(pelindrom(s));


    }

}
