import java.util.stream.IntStream;

class Solution {
    public long solution(int a, int b) {

        if (a == b) {
            return a;
        }

        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
                .asLongStream()
                .sum();
    }
}