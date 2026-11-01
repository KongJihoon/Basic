import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        ArrayList<Integer> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            
            int sum = 0;

            for (int j = 0; j < photo[i].length; j++) {
                
                String s = photo[i][j];
                
                if (!map.containsKey(s)) {
                    continue;
                }
                
                sum += map.get(s);
                
            }
            
            list.add(sum);
            
        }
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}