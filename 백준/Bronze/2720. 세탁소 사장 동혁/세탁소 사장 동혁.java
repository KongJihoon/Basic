import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        for (int i = 0; i < t; i++) {
            int sum = Integer.parseInt(br.readLine());

            if(sum >= quarter){
                System.out.print(sum / quarter + " ");
                sum %= quarter;
            }else {
                System.out.print(0 + " ");
            }
            if(sum >= dime){
                System.out.print(sum / dime + " ");
                sum %= dime;
            }else {
                System.out.print(0 + " ");
            }
            if(sum >= nickel){
                System.out.print(sum / nickel + " ");
                sum %= nickel;

            }else {
                System.out.print(0 + " ");
            }
            if (sum >= penny){
                System.out.print(sum / penny + " ");
                sum %= penny;

            }else {
                System.out.print(0 + " ");
            }
            System.out.println();
        }


    }
}