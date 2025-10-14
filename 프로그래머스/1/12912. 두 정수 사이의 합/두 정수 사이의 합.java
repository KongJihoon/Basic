class Solution {
    public long solution(int a, int b) {

        if (a == b) {
            return a;
        }

        int min = Math.min(a, b);
        
        int max = Math.max(a, b);

        long result = 0;
        
        for (int i = min; i <= max; i++) {
            result += i;
        }
        
        
        return result;
    }
}
