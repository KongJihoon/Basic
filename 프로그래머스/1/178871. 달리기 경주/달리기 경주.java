import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> map = new HashMap<>();

        int idx = 0;
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], idx++);
        }

        for (String call : callings) {
            
            int callIndex = map.get(call);
            int targetIndex = callIndex - 1;
            
            String targetPlayer = players[targetIndex];
            players[targetIndex] = players[callIndex];
            players[callIndex] = targetPlayer;
            
            map.put(call, targetIndex);
            map.put(targetPlayer, callIndex);
            
        }


        return players;
    }
}