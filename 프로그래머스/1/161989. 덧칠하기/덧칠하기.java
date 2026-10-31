class Solution {
    public int solution(int n, int m, int[] section) {
        int cnt = 0;

        int painted = 0;
        
        for (int sect : section) {
            
            if (sect <= painted) {
                continue;
            }
            
            painted = sect + m - 1;
            cnt++;
            
        }
        

        return cnt;
    }
}