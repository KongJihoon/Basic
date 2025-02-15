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



        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {

            String isVps = br.readLine();

            Stack<String> stack = new Stack<>();

            boolean checkVps = true;

            for (String s : isVps.split("")) {

                if (s.equals("(")) {
                    stack.push(s);
                } else if (s.equals(")")) {
                    if (stack.isEmpty()) {
                        checkVps = false;
                        break;
                    }
                    stack.pop();
                }

            }

            if (stack.isEmpty() && checkVps) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }


        }

        System.out.println(sb);






    }

}





