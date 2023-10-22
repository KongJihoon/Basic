import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Stack<Integer>[] stack = new Stack[4];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            stack[i] = new Stack<>();
            stack[i].push(0);
        }

        for (int item : arr) {
            for (int i = 0; i < 4; i++) {
                if (item > stack[i].peek()) {
                    stack[i].push(item);
                    break;
                }
                if (i == 3 && item <= stack[i].peek()) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");

    }
}