class Solution {
    public int solution(int[][] sizes) {
        
        int maxWidth = Integer.MIN_VALUE;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < sizes.length; i++) {
            
            int width = sizes[i][0];
            int height = sizes[i][1];
            
            maxWidth = Math.max(Math.max(width, height), maxWidth);
            maxHeight = Math.max(Math.min(width, height), maxHeight);
            
            
        }
        
        return maxWidth * maxHeight;
    }
}