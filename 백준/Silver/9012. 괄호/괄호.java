import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            

            boolean vpsCheck = true;
            for (int j = 0; j < s.length(); j++) {
                
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                } else if (stack.isEmpty()) {
                    vpsCheck = false;
                    break;
                } else {
                    stack.pop();
                }
            }

            if(vpsCheck && stack.isEmpty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

        br.close();
    }

}