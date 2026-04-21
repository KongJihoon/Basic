import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for (int itemA : nums) {

            set.add(itemA);
        }

        answer = set.size();

        if (answer > nums.length / 2) {
            answer = nums.length / 2;
        }

        return answer;
    }
}