import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        
        for (String key : participant) {
            
            map.put(key, map.getOrDefault(key, 0) + 1);
            
        }
        
        for (String item : completion) {

            int n = map.get(item) - 1;
            
            if (n == 0) {
                map.remove(item);
            } else {
                map.put(item, n);
            }

        }

        answer = map.keySet().iterator().next();

        return answer;
    }
}