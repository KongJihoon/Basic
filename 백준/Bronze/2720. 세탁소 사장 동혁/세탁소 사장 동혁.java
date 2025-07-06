
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        StringBuilder sb = new StringBuilder();



        while (n-- > 0) {
            int[] coins = new int[4];

            int coin = Integer.parseInt(br.readLine());

            while (coin > 0) {





                if (coin >= quarter) {

                    coins[0] = coin / quarter;
                    coin = coin % quarter;
                }

                if (coin >= dime) {
                    coins[1] = coin / dime;

                    coin = coin % dime;
                }

                if (coin >= nickel) {
                    coins[2] = coin / nickel;

                    coin = coin % nickel;
                }

                if (coin >= penny) {
                    coins[3] = coin / penny;;
                    coin = coin % penny;
                }


            }

            for (int i = 0; i < coins.length; i++) {
                sb.append(coins[i]).append(" ");
            }

            sb.append("\n");

        }

        System.out.println(sb);
    }

}

