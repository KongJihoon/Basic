class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            
            int received = (n / a) * b;
            
            int remain = n % a;
            
            answer += received;
            
            n = received + remain;
            
        }
        
        
        return answer;
    }
}