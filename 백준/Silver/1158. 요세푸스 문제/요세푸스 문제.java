import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        IntStream.range(1, n + 1).forEach(x -> queue.add(x));
        ArrayList<Integer> list = new ArrayList<>();

        int cnt = 0;
        while (!queue.isEmpty()){

            int data = (int) queue.remove();
            cnt++;

            if(cnt % k == 0){

                list.add(data);
            }else {
                queue.add(data);
            }
        }
        sb.append("<");
        for (int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i)).append(", ");
        }
        sb.append(list.get(list.size() - 1)).append(">");
        System.out.println(sb);
    }
}