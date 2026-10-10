import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;


        int[] arrayScore = Arrays.stream(score)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = m - 1; i < arrayScore.length; i += m) {
            answer += arrayScore[i] * m;
        }

        return answer;
    }
}