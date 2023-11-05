import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int div = N / 4;
        for (int i = 0; i < div; i++) {
            System.out.print("long ");
        }
        System.out.println("int");

    }
}