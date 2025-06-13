
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        


        StringBuilder sb1 = new StringBuilder(st.nextToken()).reverse();
        StringBuilder sb2 = new StringBuilder(st.nextToken()).reverse();


        int n = Integer.parseInt(sb1.toString());
        int n2 = Integer.parseInt(sb2.toString());

        System.out.println(Math.max(n, n2));





    }






}