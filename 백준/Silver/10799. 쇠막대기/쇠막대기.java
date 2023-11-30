import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int result = 0;

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                stack.pop();
            }

            if(i > 0){
                if(s.charAt(i - 1) == '(' && s.charAt(i) == ')'){
                    result += stack.size();
                } else if (s.charAt(i - 1) == ')' && s.charAt(i) == ')') {
                    result++;
                }
            }
        }

        System.out.println(result);



    }
}