
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine();

        int n = Integer.parseInt(br.readLine());

        char c = str.charAt(n - 1);

        System.out.println(c);



    }




}