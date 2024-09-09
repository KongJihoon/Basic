import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class Main {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringBuilder sb = new StringBuilder();

        String data;

        while (true) {

            data = br.readLine();

            if (data.equals(".")) {
                break;
            }

            if (isVps(data)) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }


        }

        System.out.println(sb);

    }


    public static boolean isVps (String data) {

        boolean isTrue = true;

        Stack<Character> stack = new Stack<>();

        for (char c : data.toCharArray()) {


            if (c == ')') {

                if (stack.empty() || stack.peek() != '(' ) {
                    isTrue = false;
                    break;
                } else {
                    stack.pop();
                }

            } else if (c == ']') {


                if (stack.empty() || stack.peek() != '[' ) {
                    isTrue = false;
                    break;
                } else {
                    stack.pop();
                }

            } else if (c == '(' || c == '['){
                stack.push(c);
            }

        }

        return isTrue && stack.empty();

    }


}


