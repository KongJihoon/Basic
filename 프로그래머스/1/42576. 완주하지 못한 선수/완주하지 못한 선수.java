import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        for (String item : participant){
            map.put(item,map.getOrDefault(item,0) + 1);
        }
        for (String item : completion){
            map.put(item,map.get(item) - 1);
        }

        for (Map.Entry<String,Integer> Item: map.entrySet()){
            if(Item.getValue() != 0){
                answer = Item.getKey();
                break;
            }
        }

        return answer;
    }
}