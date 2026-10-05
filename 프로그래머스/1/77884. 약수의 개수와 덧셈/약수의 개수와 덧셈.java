class Solution {
    public int solution(int left, int right) {

        int sum = 0;

        int start = left;
        int end = right;



        for (int i = start; i <= end; i++) {
            int cnt = 0;

            for (int j = 1; j <= i / 2; j++) {

                if (i % j == 0) {
                    cnt++;
                }

            }
            cnt++;

            if (cnt % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }

        }

        return sum;
    }
}