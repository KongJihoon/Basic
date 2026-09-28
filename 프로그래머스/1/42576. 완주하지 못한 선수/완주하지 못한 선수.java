import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
            
        }
        
        for (String complete : completion) {
            map.put(complete, map.get(complete) - 1);
        }
        
        for (String name : map.keySet()) {

            Integer value = map.get(name);
            
            if (value != 0) {
                answer = name;
            }

        }
        
        
        return answer;
    }
}