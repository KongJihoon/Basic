import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(arr);

        for (int num : arr) {

            if (num % divisor == 0) {

                result.add(num);
            }

        }
        
        if (result.isEmpty()) {
            return new int[]{-1};
        }


        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}