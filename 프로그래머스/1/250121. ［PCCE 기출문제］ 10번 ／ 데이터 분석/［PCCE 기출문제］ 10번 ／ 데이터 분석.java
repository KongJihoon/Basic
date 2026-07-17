import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int[][] answer = {};

        Map<String, Integer> map = new HashMap<>();

        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        int extIndex = map.get(ext);
        int sortIndex = map.get(sort_by);


        return Arrays.stream(data)
                .filter(x -> x[extIndex] < val_ext)
                .sorted(Comparator.comparingInt(x -> x[sortIndex]))
                .toArray(int[][]::new);
    }
}