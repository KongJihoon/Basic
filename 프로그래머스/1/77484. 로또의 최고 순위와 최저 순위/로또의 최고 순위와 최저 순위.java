class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int winCnt = 0;
        int zeroCnt = 0;

        for (int i = 0; i < lottos.length; i++) {

            int lotto = lottos[i];
            
            if (lotto == 0) {
                zeroCnt++;
                continue;
            }
            
            for (int j = 0; j < win_nums.length; j++) {
                
                
                
                if (lotto == win_nums[j]) {
                    winCnt++;
                }
                
            }
            
        }
        
        int max = getRank(zeroCnt + winCnt);
        int min = getRank(winCnt);
        


        return new int[] {max, min};
    }
    
    private int getRank(int num) {
        
        switch (num) {
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default: return 6;
            
        }
        
    }
    
}