import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int len = friends.length;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {

            map.put(friends[i], i);

        }

        int[][] giftCount = new int[len][len];
        int[] giftScore = new int[len];

        int[] nextGifted = new int[len];

        for (int i = 0; i < gifts.length; i++) {

            String[] split = gifts[i].split(" ");

            int giver = map.get(split[0]);
            int receiver = map.get(split[1]);

            giftCount[giver][receiver]++;

            giftScore[giver]++;
            giftScore[receiver]--;

        }

        for (int i = 0; i < giftCount.length; i++) {

            for (int j = i + 1; j < giftCount[i].length; j++) {


                if (giftCount[i][j] > giftCount[j][i]) {
                    nextGifted[i]++;
                } else if (giftCount[i][j] < giftCount[j][i]) {

                    nextGifted[j]++;
                } else {

                    if (giftScore[i] > giftScore[j]) {
                        nextGifted[i]++;
                    } else if (giftScore[i] < giftScore[j]) {
                        nextGifted[j]++;
                    }

                }

            }

        }

        for (int count : nextGifted) {
            answer = Math.max(answer, count);
        }



        return answer;
    }
}