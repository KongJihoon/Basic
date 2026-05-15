import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        Arrays.sort(lottos);
        Arrays.sort(win_nums);


        int zeroCnt = 0;

        int winCnt = 0;

        for (int i = 0; i < lottos.length; i++) {

            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {


                if (lottos[i] == win_nums[j]) {
                    winCnt++;
                    break;
                }

            }

        }
        
        int maxRank = getRank(zeroCnt + winCnt);
        
        int minRank = getRank(winCnt);


        return new int[]{maxRank, minRank};
    }

    public int getRank(int score) {

        switch (score) {

            case 6:
                return 1;
            case 5 :
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;

        }

    }
}