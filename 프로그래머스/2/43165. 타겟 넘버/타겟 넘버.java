class Solution {
    
    int answer;
    
    public int solution(int[] numbers, int target) {
        
        dfs(0, 0, numbers, target);
        return answer;
    }
    
    
    public void dfs(int flag, int cur, int[] numbers, int target) {
        
        if (flag == numbers.length) {
            
            if (cur == target) {
                answer++;
            }
            
            return;
        }
        
        
        dfs(flag + 1, cur + numbers[flag], numbers, target);
        dfs(flag + 1, cur - numbers[flag], numbers, target);
        
    }
}
