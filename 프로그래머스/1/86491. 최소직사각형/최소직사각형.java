class Solution {
    public int solution(int[][] sizes) {
        
        
        int wMax = 0;
        int hMax = 0;


        for (int i = 0; i < sizes.length; i++) {

            for (int[] nums : sizes) {
                
                int big = Math.max(nums[0], nums[1]);
                int small = Math.min(nums[0], nums[1]);
                
                wMax = Math.max(wMax, big);
                hMax = Math.max(hMax, small);
                
            }
            
        }
        
        
        return wMax * hMax;
    }
}