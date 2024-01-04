import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        if(input == 0){
            sb.append(0);
        }else {
            while (input != 1){
                sb.append(Math.abs(input % -2));
                input = (int) Math.ceil((double) input / -2);

            }

            sb.append(input);
        }

        System.out.println(sb.reverse());

    }
}
