import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String key : participant) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }


        for (String key : completion) {

            int n = map.get(key) - 1;

            if (n == 0) {
                map.remove(key);
            } else {
                map.put(key, n);
            }
        }

        return map.keySet().iterator().next();
    }
}