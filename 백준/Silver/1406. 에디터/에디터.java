import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {



    public static void main(String[] args) throws IOException {

        Stack<String> leftStack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        for (String item : str){
            leftStack.push(item);
        }

        int n = Integer.parseInt(br.readLine());
        Stack<String> rightStack = new Stack<>();

        while (n-- > 0){
            String[] cmd = br.readLine().split(" ");

            if(cmd[0].equals("P")){

                    leftStack.push(cmd[1]);

            } else if (cmd[0].equals("L")) {
                if(!leftStack.isEmpty()){
                    rightStack.push(leftStack.pop());
                }
            } else if (cmd[0].equals("D")) {
                if(!rightStack.isEmpty()){
                    leftStack.push(rightStack.pop());
                }
            } else if (cmd[0].equals("B")) {
                if(!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            }
        }

        while (!leftStack.isEmpty()){
            rightStack.push(leftStack.pop());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (!rightStack.isEmpty()){
            bw.write(rightStack.pop());
        }
        bw.flush();
        bw.close();
    }

}