class Solution {
    public long solution(long n) {
        long answer = 0;


        for (int i = 1; i <= Math.sqrt(n); i++) {

            if ((long) i * i == n) {
                answer = i;
            }

        }
        
        if (answer == 0) {
            return -1;
        }

        answer = (answer + 1) * (answer + 1);


        return answer;



    }
}