import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




        while (true) {

            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            ArrayList<Integer> list = nums(n);

            int result = 0;

            for (int i = 0; i < list.size(); i++) {

                result += list.get(i);


            }

            if (result == n) {
                String s = "";
                for (int i = 0; i < list.size() - 1; i++) {
                    s += list.get(i) + " + ";
                }
                s += list.get(list.size() - 1);

                System.out.println(n + " = "  + s);

            } else {
                System.out.println(n + " is NOT perfect.");
            }

        }



    }

    public static ArrayList<Integer> nums(int num) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < num; i++) {

            if(num % i == 0) {
                list.add(i);
            }

        }

        return list;
    }




}
