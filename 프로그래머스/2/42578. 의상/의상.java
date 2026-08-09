import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            
            String type = clothes[i][1];
            
            map.put(type, map.getOrDefault(type, 0) + 1);
            
            
        }
        
        for (String type : map.keySet()) {
            
            // 옷을 안입는 경우의 수 포함
            answer *= map.get(type) + 1;
            
        }
        
        // 모두 착용하지 않은 경우의 수 감소
        answer--;


        return answer;
    }
}