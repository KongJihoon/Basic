import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {

        int start = Math.min(a, b);
        int end = Math.max(a, b);
        
        return LongStream.rangeClosed(start, end)
                .sum();
    }
}