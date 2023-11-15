import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] score = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};
        double[] scoreNum = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double sumA = 0;
        double sumB = 0;
        StringTokenizer st;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(sc.nextLine());
            String s = st.nextToken();
            double num = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            for (int j = 0; j < score.length; j++) {
                if(grade.equals(score[j])){
                    sumA += (num * scoreNum[j]);
                }
            }
            if(grade.equals("P")){
                continue;
            }
            sumB += num;
        }
        System.out.println(sumA / sumB);
    }
}
