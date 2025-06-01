
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());
        
        int result = 0;
        
        while (n-- > 0) {
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int price = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());
            
            result += price * quantity;
            
        }
        
        if (totalPrice == result) {
            
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        
    }

    

}