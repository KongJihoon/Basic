import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        ArrayList<Integer> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            
            map.put(name[i], yearning[i]);
            
        }

        for (int i = 0; i < photo.length; i++) {

            int sum = 0;
            
            for (int j = 0; j < photo[i].length; j++) {
                
                
                if (map.containsKey(photo[i][j])) {
                    sum += map.get(photo[i][j]);
                }
                
                
            }
            
            result.add(sum);
            
        }

        return result.stream()
                .mapToInt(num -> num)
                .toArray();
    }
}