import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n ;
    static ArrayList<Integer>[] list;
    static int[] parents;
    static boolean[] check;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        list = new ArrayList[n + 1];
        parents = new int[n + 1];
        check = new boolean[n + 1];

        for (int i = 0; i <= n ; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b);
            list[b].add(a);
        }
        for (int i = 0; i <= n; i++) {
            if(!check[i]){
                dfs(i);
            }
        }
        for (int i = 2; i <= n ; i++) {
            System.out.println(parents[i]);
        }



    }

   private static void dfs(int idx){
        if(check[idx]){
         return;
        }
        check[idx] = true;
        for (int item : list[idx]){
            if (!check[item]){
                parents[item] = idx;
                dfs(item);
            }
        }

    }

}