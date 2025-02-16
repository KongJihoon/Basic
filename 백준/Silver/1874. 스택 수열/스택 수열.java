import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack stack = new Stack();

        int start = 0;

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {

            int num = Integer.parseInt(br.readLine());


            if (num > start) {

                for (int i = start + 1; i <= num; i++) {


                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = num;

            }

            if (stack.peek().equals(num)) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                break;
            }


        }

        if (stack.isEmpty()) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }







    }

}





