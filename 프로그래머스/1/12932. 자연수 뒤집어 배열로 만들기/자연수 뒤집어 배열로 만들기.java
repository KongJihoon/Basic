import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(long n) {

        ArrayList<Integer> list = new ArrayList<>();
        
        
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        
        sb.reverse();
        
        for (String s : sb.toString().split("")) {
            list.add(Integer.parseInt(s));
        }
    
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}