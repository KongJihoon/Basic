import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int numBags = -1; 

        
        for (int i = N / 5; i >= 0; i--) {
            int remaining = N - (i * 5);
            if (remaining % 3 == 0) {
                numBags = i + (remaining / 3);
                break;
            }
        }

        System.out.println(numBags);
    }
}
