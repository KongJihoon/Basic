class Solution {
    public int solution(int[][] sizes) {
        

        int wMax = 0;
        
        int hMax = 0;
        
        for (int[] n : sizes) {

            int big = Math.max(n[0], n[1]);
            int small = Math.min(n[0], n[1]);
            
            wMax = Math.max(wMax, big);
            
            hMax = Math.max(hMax, small);
            
        }
        

        return wMax * hMax;
    }


}