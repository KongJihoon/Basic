import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;

        int cnt = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {

            if (sum + d[i] > budget) {
                continue;
            }

            sum += d[i];
            cnt++;


        }

        return cnt;
    }
}