import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
               if(c >= 'N'){
                   sb.append((char) (c - 13));
               }else {
                   sb.append((char) (c + 13));
               }
            }else if(Character.isLowerCase(c)){
                if(c >= 'n'){
                    sb.append((char) (c - 13));

                }else {
                    sb.append((char) (c + 13));

                }
            }else {
                sb.append(c);
            }

        }
        System.out.println(sb);


    }
}