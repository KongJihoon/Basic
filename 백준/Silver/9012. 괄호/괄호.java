import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            sb.append(isStack(s)).append("\n");
        }
        System.out.println(sb);

    }


    public static String isStack(String item){
        if(item.length() == 0){
            return null;
        }
        Stack<Character> stack = new Stack();
        boolean vpsCheck = true;
        for (char c : item.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else if (stack.isEmpty()) {
                vpsCheck = false;
                break;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty() && vpsCheck ? "YES" : "NO";
    }

}