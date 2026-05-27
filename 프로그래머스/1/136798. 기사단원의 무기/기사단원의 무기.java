class Solution {
    public int solution(int number, int limit, int power) {

        // 각 기사에게 1번부터 number까지 번호가 지정
        // 각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려함
        // 단, 제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 정해진 공격력을 가진 무기를 구매해야한다.


        int answer = 0;

        for (int i = 1; i <= number; i++) {
            
            int factorCnt = getFactor(i);
            
            if (factorCnt > limit) {
                answer += power;
                continue;
            }
            
            answer += factorCnt;
            
        }


        return answer;
    }


    public int getFactor(int num) {

        int result = 0;

        for (int i = 1; i <= num / 2 ; i++) {

            if (num % i == 0) {
                result++;
            }


        }

        result++;


        return result;
    }
}