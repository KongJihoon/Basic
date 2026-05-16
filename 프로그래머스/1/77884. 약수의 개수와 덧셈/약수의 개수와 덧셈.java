class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {

            int divisor = getDivisorCnt(i);

            if (divisor % 2 == 0) {
                answer += i;
            } else  {
                answer -= i;
            }

        }

        return answer;
    }


    public int getDivisorCnt(int num) {

        int divisor = 1;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                divisor++;
            }

        }


        return divisor;
    }
}