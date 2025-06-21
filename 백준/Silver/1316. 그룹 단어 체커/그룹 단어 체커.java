import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (n-- > 0) {

            if (checkWords()) {
                cnt++;
            }

        }

        System.out.println(cnt);




    }


    public static boolean checkWords() throws IOException {

        String str = br.readLine();

        boolean[] check =new boolean[26];


        int prev = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (prev != c) {

                if (!check[c - 'a']) {


                    check[c - 'a'] = true;
                    prev = c;
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