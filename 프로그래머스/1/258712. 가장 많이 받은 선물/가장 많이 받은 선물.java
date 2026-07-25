import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int len = friends.length;

        Map<String, Integer> friendIndex = new HashMap<>();

        for (int i = 0; i < len; i++) {

            friendIndex.put(friends[i], i);

        }

        int[][] giftCount = new int[len][len];

        int[] giftScore = new int[len];

        int[] nextGiftCount = new int[len];

        for (String gift : gifts) {

            String[] names = gift.split(" ");

            int giver = friendIndex.get(names[0]);
            int receiver = friendIndex.get(names[1]);

            giftCount[giver][receiver]++;

            giftScore[giver]++;
            giftScore[receiver]--;

        }

        for (int i = 0; i < len; i++) {

            for (int j = i + 1; j < len; j++) {
                
                if (giftCount[i][j] > giftCount[j][i]) {
                    nextGiftCount[i]++;
                } else if (giftCount[i][j] < giftCount[j][i]) {
                    nextGiftCount[j]++;
                } else {
                    if (giftScore[i] > giftScore[j]) {
                        nextGiftCount[i]++;
                    } else if (giftScore[i] < giftScore[j]) {
                        nextGiftCount[j]++;
                    }

                }


            }
            
        }
        
        for (int count : nextGiftCount) {
            answer = Math.max(answer, count);
        }
        

        return answer;
    }
}