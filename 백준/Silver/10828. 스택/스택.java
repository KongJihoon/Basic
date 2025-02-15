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

        ArrayList list = new ArrayList();

        Stack stack = new Stack(list);

        StringTokenizer st;

        while (n-- > 0) {

            st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();

            if (cmd.equals("push")) {

                stack.push(Integer.parseInt(st.nextToken()));

            } else if (cmd.equals("pop")) {
                sb.append(stack.pop()).append("\n");
            } else if (cmd.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (cmd.equals("empty")) {
                sb.append(stack.empty()).append("\n");
            } else if(cmd.equals("top")) {
                sb.append(stack.top()).append("\n");
            }

        }

        System.out.println(sb.toString());


    }

}

class Stack {

    ArrayList list;

    public Stack(ArrayList list) {
        this.list = list;
    }

    public void push(int num) {

        list.add(num);

    }

    public int pop() {

        if (list.isEmpty()) {
            return -1;
        }

        int data = (int)list.get(list.size() - 1);

        list.remove(list.size() - 1);


        return data;
    }

    public int size() {

        return list.size();
    }

    public int empty() {

        if (list.isEmpty()) {
            return 1;
        } else {
            return 0;
        }

    }

    public int top() {
        if (list.isEmpty()) {
            return -1;
        }

        int data = (int)list.get(list.size() - 1);



        return data;
    }

}



