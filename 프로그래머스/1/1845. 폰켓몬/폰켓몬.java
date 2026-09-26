import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {

        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            
            set.add(num);
        }
        
        int max = nums.length / 2;
        
        return Math.min(max, set.size());
    }
}