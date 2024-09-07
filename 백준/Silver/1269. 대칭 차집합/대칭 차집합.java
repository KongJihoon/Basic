import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            A.add(Integer.parseInt(st.nextToken()));

        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {

            B.add(Integer.parseInt(st.nextToken()));

        }

        int cnt = 0;

        for (int num : B) {
            if (!A.contains(num)) {
                cnt++;
            }
        }


        for (int num : A) {
            if (!B.contains(num)) {
                cnt++;
            }
        }


        System.out.println(cnt);



    }

}
