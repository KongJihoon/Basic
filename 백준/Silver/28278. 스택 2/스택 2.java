import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class MyStack {

    ArrayList list;


    MyStack() {
        this.list = new ArrayList<>();
    }

    public int isEmpty() {

        if(list.size() == 0) {
            return 1;
        }else {
            return 0;
        }

    }

    public void push(int data) {

        list.add(data);

    }

    public int pop() {

        if (list.size() == 0) {
            return -1;
        }

        int data = (int)list.get(list.size() - 1);

        list.remove(list.size() - 1);

        return data;
    }

    public int size() {

        int data = list.size();


        return data;
    }

    public int peek() {

        if (list.size() == 0) {

            return -1;
        }

        int data = (int)list.get(list.size() - 1);

        return data;
    }


}


public class Main {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MyStack myStack = new MyStack();

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());



        while (n-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();
            
            if (command.equals("1")) {
                
                myStack.push(Integer.parseInt(st.nextToken()));
            } else if (command.equals("2")) {
                sb.append(myStack.pop()).append("\n");
            } else if (command.equals("3")) {
                sb.append(myStack.size()).append("\n");
            } else if (command.equals("4")) {
                sb.append(myStack.isEmpty()).append("\n");
            } else {
                sb.append(myStack.peek()).append("\n");
            }


        }

        System.out.println(sb);



    }



}


