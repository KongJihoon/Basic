import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String s = br.readLine();
        for (int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])){
                s = s.replace(arr[i],"!");
            }
        }
        System.out.println(s.length());

    }
}
