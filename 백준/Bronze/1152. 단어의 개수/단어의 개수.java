import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] word = str.split(" ");
        if(word.length == 0){
            System.out.println(0);
            System.exit(0);
        }
        
        if(word[0] == ""){
            System.out.println(word.length - 1);
        }else {
            System.out.println(word.length);
        }
        
    }
}