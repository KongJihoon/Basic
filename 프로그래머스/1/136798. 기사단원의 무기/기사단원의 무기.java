class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;

        for (int i = 2; i <= number; i++) {
            
            int factor = getFactor(i);
            
            if (factor > limit) {
                answer += power;
            } else {
                answer += factor;
            }
            
        }
        
        return answer;
    }
    
    private int getFactor(int n) {

        int cnt = 1;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        
        
        return cnt;
    }
}