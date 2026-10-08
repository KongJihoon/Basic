class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        int coke = n;
        
        while (coke >= a) {
            
            int newCoke = (coke / a) * b;
            
            coke = coke % a == 0 ? newCoke : newCoke + (coke % a);
            
            answer += newCoke;
            
        }
        
        return answer;
    }
}