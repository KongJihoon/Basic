import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        DequeMethod dequeMethod = new DequeMethod(list);

        while (n-- > 0) {

            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            if (s.equals("push_front")) {

                dequeMethod.push_front(Integer.parseInt(st.nextToken()));

            } else if (s.equals("push_back")) {
                dequeMethod.push_back(Integer.parseInt(st.nextToken()));

            } else if (s.equals("pop_front")) {

                sb.append(dequeMethod.pop_front()).append("\n");

            } else if (s.equals("pop_back")) {

                sb.append(dequeMethod.pop_back()).append("\n");

            } else if (s.equals("size")) {
                sb.append(dequeMethod.size()).append("\n");
            } else if (s.equals("empty")) {
                sb.append(dequeMethod.empty()).append("\n");
            } else if (s.equals("front")) {
                sb.append(dequeMethod.front()).append("\n");
            } else if (s.equals("back")) {
                sb.append(dequeMethod.back()).append("\n");
            }


        }

        System.out.println(sb);

    }





}


class DequeMethod {

    ArrayList<Integer> list;

    public DequeMethod(ArrayList<Integer> list) {
        this.list = list;
    }


    public void push_front(int value) {

        list.add(0,value);

    }

    public void push_back(int value) {
        list.add(value);
    }

    public int pop_front() {


        if (list.isEmpty()) {
            return -1;
        }

        int data = list.get(0);

        list.remove(0);

        return data;
    }
    public int pop_back() {


        if (list.isEmpty()) {
            return -1;
        }

        int data = list.get(list.size() - 1);

        list.remove(list.size() - 1);

        return data;
    }

    public int size() {


        return list.size();
    }

    public int empty() {

        if (list.isEmpty()) {
            return 1;
        }

        return 0;

    }

    public int front() {
        if (list.isEmpty()) {
            return -1;
        }

        return list.get(0);
    }

    public int back() {
        if (list.isEmpty()) {
            return -1;
        }

        return list.get(list.size() - 1);
    }



}





