import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        Map<String, Integer> map = new HashMap<>();

        int index = 0;

        for (String player : players) {
            map.put(player, index++);
        }


        for (String call : callings) {

            int callIndex = map.get(call).intValue();
            int targetIndex = callIndex - 1;

            String target = players[targetIndex];
            players[targetIndex] = players[callIndex];
            players[callIndex] = target;

            map.put(call, targetIndex);
            map.put(target, callIndex);

        }

        return players;
    }


    public static void main(String[] args) {

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};

        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution(players, callings)));

    }
}