import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arrA = br.readLine().split(" ");
        String[] arrB = br.readLine().split(" ");
        String[] arrC = br.readLine().split(" ");

        String[] result = new String[2];

        if (arrA[0].equals(arrB[0])) {
            result[0] = arrC[0];
        } else if (arrA[0].equals(arrC[0])) {
            result[0] = arrB[0];
        } else {
            result[0] = arrA[0];
        }

        if (arrA[1].equals(arrB[1])) {
            result[1] = arrC[1];
        } else if (arrA[1].equals(arrC[1])) {
            result[1] = arrB[1];
        } else {
            result[1] = arrA[1];
        }

        for (String s : result) {
            System.out.print(s + " ");
        }


    }



}
