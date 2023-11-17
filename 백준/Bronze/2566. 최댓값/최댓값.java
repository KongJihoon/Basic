import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxNum = Integer.MIN_VALUE;
        int idxA = 0;
        int idxB = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(maxNum < arr[i][j]){
                    maxNum = arr[i][j];
                    idxA = i;
                    idxB = j;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println((idxA + 1) + " " + (idxB + 1));
    }
}
