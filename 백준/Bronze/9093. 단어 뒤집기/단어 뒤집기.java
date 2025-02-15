import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());



        StringBuilder sb = new StringBuilder();



        while (n-- > 0) {


            String str = br.readLine();
            ArrayList list = new ArrayList();


            for (String s : str.split(" ")) {

                sb = new StringBuilder(s);
                list.add(sb.reverse());
            }


            for (int i = 0; i < list.size(); i++) {

                System.out.print(list.get(i) + " ");

            }
            System.out.println();

        }







    }

}





