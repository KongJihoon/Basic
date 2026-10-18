class Solution {
    public int solution(int n, int m, int[] section) {

        int cnt = 0;
        int painted = 0;

        for (int s : section) {

            if (s <= painted) {
                continue;
            }

            cnt++;
            painted = s + m - 1;

        }


        return cnt;
    }
}