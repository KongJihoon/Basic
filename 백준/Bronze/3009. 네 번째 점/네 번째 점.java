import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrA = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()) ;
        int[] arrB = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()) ;
        int[] arrC = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x = 0;
        int y = 0;

        if(arrA[0] == arrB[0]){
            x = arrC[0];
        } else if (arrA[0] == arrC[0]) {
            x = arrB[0];
        } else if (arrB[0] == arrC[0]) {
            x = arrA[0];
        }

        if(arrA[1] == arrB[1]){
            y = arrC[1];
        } else if (arrA[1] == arrC[1]) {
            y = arrB[1];
        } else if (arrB[1] == arrC[1]) {
            y = arrA[1];
        }

        System.out.println(x + " " + y);

    }
}
