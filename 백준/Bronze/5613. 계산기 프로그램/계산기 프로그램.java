import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        String s = "";
        while (!s.equals("=")) {
            s = br.readLine();
            switch (s) {
                case "+":
                    int b = Integer.parseInt(br.readLine());
                    a += b;
                    break;
                case "-":
                    b = Integer.parseInt(br.readLine());
                    a -= b;
                    break;
                case "*":
                    b = Integer.parseInt(br.readLine());
                    a *= b;
                    break;
                case "/":
                    b = Integer.parseInt(br.readLine());
                    a /= b;
                    break;
            }
        }
        System.out.println(a);


    }

}