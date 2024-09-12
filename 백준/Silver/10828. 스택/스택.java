import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;


class MyStack {

    ArrayList list;

    MyStack() {
        this.list = new ArrayList();
    }

    public void push(int data) {

        this.list.add(data);

    }

    public int pop() {

        if (this.list.size() == 0) {
            return -1;
        }

        int data = (int)this.list.get(this.list.size() - 1);

        this.list.remove(this.list.size() - 1);


        return data;
    }

    public int size() {

        return this.list.size();
    }

    public int empty() {

        if (this.list.size() == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public int top() {

        if (this.list.size() == 0) {
            return -1;
        }

        int data = (int)this.list.get(this.list.size() - 1);

        return data;
    }

}


public class Main {




    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        MyStack stack = new MyStack();

        while (n-- > 0) {

            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            if (s.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (s.equals("pop")) {
                sb.append(stack.pop()).append("\n");
            } else if (s.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (s.equals("empty")) {
                sb.append(stack.empty()).append("\n");
            } else {
                sb.append(stack.top()).append("\n");
            }


        }


        System.out.println(sb);
    }


}


