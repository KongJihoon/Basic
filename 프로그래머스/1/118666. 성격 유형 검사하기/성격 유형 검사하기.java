import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < choices.length; i++) {

            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);

            if (choices[i] < 4) {

                map.put(disagree, map.getOrDefault(disagree, 0) + (4 - choices[i]));

            } else if (choices[i] > 4) {
                
                map.put(agree, map.getOrDefault(agree, 0) + (choices[i] - 4));
                
            }

        }
        
        
        StringBuilder sb = new StringBuilder();

        sb.append(compare(map, 'R', 'T'));
        sb.append(compare(map, 'C', 'F'));
        sb.append(compare(map, 'J', 'M'));
        sb.append(compare(map, 'A', 'N'));

        return sb.toString();
    }
    
    
    private char compare(Map<Character, Integer> map, char a, char b) {
        
        int aScore = map.getOrDefault(a, 0);
        int bScore = map.getOrDefault(b, 0);
        
        if (aScore >= bScore) {
            return a;
        }
        
        return b;
    }
    
}