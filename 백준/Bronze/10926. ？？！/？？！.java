

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        sb.append(br.readLine());
        sb.append("??!");
        System.out.println(sb);

    }
}