class Solution {
    public int solution(int n, int m, int[] section) {
    
        int painted = 0;
        int cnt = 0;
        
        for (int s : section) {
            
            if (s <= painted) {
                continue;
            }
            
            cnt++;
            painted = s + m - 1;
            
        }
    
        
        return cnt;
    }
}