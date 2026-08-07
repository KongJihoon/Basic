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
            
            // 해당 종류의 의상을 안입는 경우를 더해서 곱해준다.
            answer *= (map.get(type) + 1);
        }
        
        // 모든 의상을 안입은 경우가 포함되어 있으므로 1개 감소
        answer--;
        

        return answer;
    }
}