import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (String tmp : str.split(" ")){
                sb.append(reverse(tmp)).append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }

    public static String reverse(String item){
        if(item.length() == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();

        sb.append(item).reverse();
        return sb.toString();

    }

}