import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        int min = Integer.MAX_VALUE;
        
        for (int num : arr) {
            
            if (min > num) {
                min = num;
            }
            
        }

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (num == min) {
                continue;
            }
            
            list.add(num);
        }
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}