import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

class MyQueue{
    ArrayList list;
    MyQueue(){
        this.list = new ArrayList();
    }

    public int isEmpty(){
        if(this.list.size() == 0){
            return 1;
        }else {
            return 0;
        }
    }

    public void push(int data){
        this.list.add(data);
    }

    public Integer pop(){
        if(this.list.isEmpty()){
            return -1;
        }
        int data = (int)this.list.get(0);
        this.list.remove(0);

        return data;
    }
    public Integer front(){
        if(this.list.isEmpty()){
            return -1;
        }

        return (int)this.list.get(0);
    }

    public Integer back(){
        if(this.list.isEmpty()){
            return -1;
        }

        return (int)this.list.get(this.list.size() - 1);
    }

    public Integer size(){
        if(this.list.isEmpty()){
            return 0;
        }

        return this.list.size();
    }


}


public class Main {



    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyQueue queue = new MyQueue();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0){
            String[] cmd = br.readLine().split(" ");

            if(cmd[0].equals("push")){
                queue.push(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("pop")) {
                sb.append(queue.pop()).append("\n");
            } else if (cmd[0].equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (cmd[0].equals("empty")) {
                sb.append(queue.isEmpty()).append("\n");
            } else if (cmd[0].equals("front")) {
                sb.append(queue.front()).append("\n");
            } else if (cmd[0].equals("back")) {
                sb.append(queue.back()).append("\n");
            }
        }

        System.out.println(sb);
    }
}