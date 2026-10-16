import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {

        ArrayList<Integer> list = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {


            for (int j = 0; j < keymap[i].length(); j++) {

                char c = keymap[i].charAt(j);

                if (map.containsKey(c)) {

                    map.put(c, Math.min(map.get(c), j + 1));

                } else {
                    map.put(c, j + 1);
                }
            }

        }

        for (String target : targets) {
            int sum = 0;


            for (int i = 0; i < target.length(); i++) {

                char c = target.charAt(i);

                if (map.containsKey(c)) {
                    sum += map.get(c);
                } else {
                    sum = -1;
                    break;
                }

            }

            list.add(sum);

        }


        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}