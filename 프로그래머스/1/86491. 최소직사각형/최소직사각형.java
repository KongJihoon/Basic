class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxWidth = 0;
        
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            
            int maxValue = Math.max(sizes[i][0], sizes[i][1]);
            int minValue = Math.min(sizes[i][0], sizes[i][1]);
            
            maxWidth = Math.max(maxValue, maxWidth);
            maxHeight = Math.max(minValue, maxHeight);
            
        }
        
        answer = maxWidth * maxHeight;
        
        return answer;
    }
}