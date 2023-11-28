import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0){
            String[] cmd = br.readLine().split(" ");

            if(cmd[0].equals("push_front")){
                deque.addFirst(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("push_back")) {
                deque.addLast(Integer.parseInt(cmd[1]));
            }else if (cmd[0].equals("pop_front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                int data = deque.removeFirst();
                sb.append(data).append("\n");
            }else if (cmd[0].equals("pop_back")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                int data = deque.removeLast();
                sb.append(data).append("\n");
            } else if (cmd[0].equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (cmd[0].equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if (cmd[0].equals("front")) {
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.peekFirst()).append("\n");
            } else if (cmd[0].equals("back")) {
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.peekLast()).append("\n");
            }

        }
        System.out.println(sb);
    }
}