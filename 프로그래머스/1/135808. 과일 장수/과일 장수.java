import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {


        // 최저 사과점수(score[]) * 한 상자에 담긴 사과 개수(m) * 상자 개수

        int answer = 0;

        Arrays.sort(score);


        for (int i = score.length - m; i >= 0; i-=m) {

            answer += score[i] * m;
        }


        return answer;
    }
}