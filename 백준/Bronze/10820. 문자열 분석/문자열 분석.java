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
        while (str != null){
            int lower = 0;
            int upper = 0;
            int num = 0;
            int space = 0;
            for (char item : str.toCharArray()){
                if(Character.isLowerCase(item)){
                    lower++;
                } else if (Character.isUpperCase(item)) {
                    upper++;
                } else if (Character.isDigit(item)) {
                    num++;
                } else if (Character.isWhitespace(item)) {
                    space++;
                }
            }
            sb.append(lower).append(" ").append(upper).append(" ").append(num)
                    .append(" ").append(space).append("\n");
            str = br.readLine();
        }
        System.out.println(sb);
    }
}