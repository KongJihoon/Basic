import java.util.stream.IntStream;
import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;


        if (a > b) {
            answer = LongStream.range(b, a + 1).sum();

        } else {

            answer = LongStream.range(a, b + 1).sum();

        }

        return answer;
    }
}