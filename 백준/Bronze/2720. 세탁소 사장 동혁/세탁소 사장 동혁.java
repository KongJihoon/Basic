import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] coins = {25, 10, 5, 1};

        int[] result = new int[4];

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int cost = Integer.parseInt(br.readLine());

            for (int i = 0; i < coins.length; i++) {

                if (cost % coins[i] != 0) {
                    if(cost < coins[i]) {
                        continue;
                    }

                    result[i] = cost / coins[i];
                    cost = cost % coins[i];
                } else {
                    result[i] = cost / coins[i];
                    break;
                }

            }

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }

            System.out.println();
            
            result = new int[4];

        }






    }






}
