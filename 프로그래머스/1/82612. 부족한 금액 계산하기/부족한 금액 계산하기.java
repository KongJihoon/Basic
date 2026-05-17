class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;


        long cntPrice = 0;

        for (int i = 1; i <= count; i++) {

            cntPrice += (long) price * i;

        }

        if (money - cntPrice > 0) {
            return 0;
        }

        answer = Math.abs(cntPrice - money);

        return answer;
    }
}