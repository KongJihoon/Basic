import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int king = 1;
        int queen = 1;
        int look = 2;
        int bishop = 2;
        int knight = 2;
        int pone = 8;

        king = king - Integer.parseInt(st.nextToken());
        queen = queen - Integer.parseInt(st.nextToken());
        look = look - Integer.parseInt(st.nextToken());
        bishop = bishop - Integer.parseInt(st.nextToken());
        knight = knight - Integer.parseInt(st.nextToken());
        pone = pone - Integer.parseInt(st.nextToken());

        System.out.println(king + " " + queen + " " + look + " " + bishop + " " + knight + " " + pone);


    }

}
