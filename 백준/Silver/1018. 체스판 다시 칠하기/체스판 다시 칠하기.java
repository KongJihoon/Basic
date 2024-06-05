import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int min = 64;
    public static boolean[][] chess;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        chess = new boolean[n][m];

        for (int i = 0; i < n; i++) {

            String s = br.readLine();

            for (int j = 0; j < m; j++) {

                if (s.charAt(j) == 'W') {
                    chess[i][j] = true; //하얀색 true
                } else {
                    chess[i][j] = false; // 검은색 false
                }

            }
        }

        int row = n - 7;
        int col = m - 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);


    }

    public static void find(int x, int y) {

        int end_x = x + 8;
        int end_y = y + 8;

        int cnt = 0;

        boolean check = chess[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {

                if(chess[i][j] != check) {
                    cnt++;
                }
                check = (!check);
            }
            check = (!check);

        }

        cnt = Math.min(cnt, 64 - cnt);

        min = Math.min(cnt, min);


    }

}
